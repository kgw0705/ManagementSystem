package com.example.managementsystem.budget.controller;
import com.example.managementsystem.budget.entity.BudgetRequest;
import com.example.managementsystem.budget.entity.BudgetItem;
import com.example.managementsystem.budget.entity.Document;
import com.example.managementsystem.budget.repository.BudgetRequestRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class SubmitSystem {

    @Autowired
    private BudgetRequestRepository budgetRequestRepository;


    @Transactional
    public int submitRequest(@RequestBody BudgetRequest requestDto, List<MultipartFile> documentFile) throws IOException {

        if (budgetRequestRepository.existsByDepartmentId(requestDto.getDepartmentId())) {
            return -1; //아이디 중복 체크
        }
        if(requestDto.getBudgetItems().size()==0){
            return -2; //budgetItem 하나도 없을 때
        }
        int total = 0;
        int total2 = 0;
        System.out.println(requestDto);
        BudgetRequest budgetRequest = new BudgetRequest();
        budgetRequest.setId(requestDto.getId());
        budgetRequest.setDepartmentId(requestDto.getDepartmentId());
        budgetRequest.setTotalAmount(requestDto.getTotalAmount());

        for (BudgetItem item : requestDto.getBudgetItems()) {
            total += (int) item.getAllocated_amount();
            total2 += (int) item.getExecuted_amount();
            budgetRequest.addBudgetItem(item);
        }
        if (total < total2) {
            return -3; //만약 집행금액이 예산금액보다 높을시
        }
        budgetRequest.setTotalAmount(total);

        if (documentFile != null && !documentFile.isEmpty()) {
            for (MultipartFile file : documentFile) {
                if (!file.isEmpty()) {
                    String document_name = file.getOriginalFilename();
                    String saveDir = "C:/budgetDocument";
                    String savePath = saveDir + "/" + document_name;

                    // 저장 디렉토리가 존재하지 않으면 생성
                    Path path = Paths.get(saveDir);
                    if (!Files.exists(path)) {
                        Files.createDirectories(path);
                    }
                    String documentName= Integer.toString(requestDto.getDepartmentId())+":"+document_name;
                    Document document = new Document();
                    document.setDocument_name(documentName);
                    document.setFile_path(savePath);
                    file.transferTo(new File(savePath));

                    budgetRequest.addDocuments(document);
                }
            }
        }

        budgetRequestRepository.save(budgetRequest);

        return 0;
    }

    public List<BudgetRequest> getApprovedRequests() {
        return budgetRequestRepository.findByStatus("승인됨");
    }
}
