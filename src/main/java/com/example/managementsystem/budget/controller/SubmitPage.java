package com.example.managementsystem.budget.controller;

import com.example.managementsystem.budget.entity.BudgetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

@RestController
@Controller
@RequestMapping("/user")
public class SubmitPage {

    @Autowired
    private SubmitSystem submitSystem;

    @PostMapping("/submitBudgetRequest")
    @ResponseBody
    public Map<String, String> submitBudgetRequest(@RequestPart("budgetRequest") BudgetRequest budgetRequest,
                                                   @RequestPart("documentFile") List<MultipartFile> documentFile) throws IOException {



        int isSuccess = submitSystem.submitRequest(budgetRequest, documentFile);
        Map<String, String> response = new HashMap<>();

        if (isSuccess == 0) {
            response.put("status", "success");
            response.put("message", "신청이 성공적으로 완료되었습니다!");
        } else if (isSuccess == -1) {
            response.put("status", "error");
            response.put("message", "이미 신청되었습니다.");
        } else if (isSuccess == -2) {
            response.put("status", "error");
            response.put("message", "예산항목을 입력해주세요");
        } else {
            response.put("status", "error");
            response.put("message", "예산총액과 집행금액이 맞지 않습니다");
        }

        return response;
    }
}
