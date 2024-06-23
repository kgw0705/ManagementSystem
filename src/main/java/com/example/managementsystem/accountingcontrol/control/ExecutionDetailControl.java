package com.example.managementsystem.accountingcontrol.control;

import com.example.managementsystem.accountingcontrol.entity.CardUsage;
import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import com.example.managementsystem.accountingcontrol.service.ExecutionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    
    // 카드사용내역 조회 (날짜, 키워드)
    @GetMapping("/getExecutionDetail")
    public List<CardUsage> getExecutionDetail(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate, @RequestParam String keyword) {
        return executionDetailService.getExecutionDetailsByDateAndKeyword(startDate, endDate, keyword);
    }
    
    // 집행세부내역 전체 조회
    @GetMapping("/getExecutionDetails")
    public List<ExecutionDetail> getExecutionDetail() {
        return executionDetailService.getExecutionDetails();
    }
    
    // 카드번호 체크
    @GetMapping("/checkCardNum2/{cardNum}")
    public String checkCardNum(@PathVariable String cardNum) {
        return executionDetailService.checkCardNum(cardNum) ? "Exists" : "Does not exist";
    }
}
