package com.example.managementsystem.accountingcontrol.service;

import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import com.example.managementsystem.accountingcontrol.repository.ExecutionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionDetailService
{
    private final ExecutionDetailRepository executionDetailRepository;
    
    @Autowired
    public ExecutionDetailService(ExecutionDetailRepository executionDetailRepository) {
        this.executionDetailRepository = executionDetailRepository;
    }
    
    // 집행세부내역 등록
    public void addExecutionDetail(ExecutionDetail executionDetail) {
        if (checkCardNum(executionDetail.getCardNum())) {
            executionDetailRepository.save(executionDetail);
        }
    }
    
    public List<ExecutionDetail> getExecutionDetails() {
        return executionDetailRepository.findAll();
    }
    
    // 카드번호 체크
    public boolean checkCardNum(String cardNum) {
        // Here you can add the logic to check the card number
        // This is a simple validation logic for demonstration purposes
        return cardNum != null && !cardNum.trim().isEmpty();
    }
}
