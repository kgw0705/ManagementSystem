package com.example.managementsystem.accountingcontrol.control;

import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import com.example.managementsystem.accountingcontrol.service.ExecutionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExecutionDetailControl
{
    private final ExecutionDetailService executionDetailService;
    
    @Autowired
    public ExecutionDetailControl(ExecutionDetailService executionDetailService) {
        this.executionDetailService = executionDetailService;
    }
    
    // 집행세부내역 등록
    @PostMapping("/addExecutionDetail")
    public void addExecutionDetail(@RequestBody ExecutionDetail executionDetail) {
        executionDetailService.addExecutionDetail(executionDetail);
    }
    
    // 집행세부내역 조회
    @GetMapping("/getExecutionDetail")
    public List<ExecutionDetail> getExecutionDetail() {
        return executionDetailService.getExecutionDetails();
    }
    
    // 카드번호 체크
    @GetMapping("/checkCardNum/{cardNum}")
    public String checkCardNum(@PathVariable String cardNum) {
        // Here you can add the logic to check the card number
        return "Card number checked";
    }
}
