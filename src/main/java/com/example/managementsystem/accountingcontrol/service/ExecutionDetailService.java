package com.example.managementsystem.accountingcontrol.service;

import com.example.managementsystem.accountingcontrol.entity.CardUsage;
import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import com.example.managementsystem.accountingcontrol.repository.CardUsageRepository;
import com.example.managementsystem.accountingcontrol.repository.DepartmentRepository;
import com.example.managementsystem.accountingcontrol.repository.ExecutionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExecutionDetailService
{
    private final ExecutionDetailRepository executionDetailRepository;
    private final DepartmentRepository departmentRepository;
    private final CardUsageRepository cardUsageRepository;
    
    @Autowired
    public ExecutionDetailService(ExecutionDetailRepository executionDetailRepository,DepartmentRepository departmentRepository, CardUsageRepository cardUsageRepository) {
        this.executionDetailRepository = executionDetailRepository;
        this.departmentRepository = departmentRepository;
        this.cardUsageRepository = cardUsageRepository;
    }
    
    // 집행세부내역 등록
    public void addExecutionDetail(ExecutionDetail executionDetail) {
        if (checkCardNum(executionDetail.getCardNum())) {
            executionDetailRepository.save(executionDetail);
        }
    }
    
    // 카드사용내역 조회 (날짜, 키워드)
    public List<CardUsage> getExecutionDetailsByDateAndKeyword(LocalDate startDate, LocalDate endDate, String keyword) {
        return cardUsageRepository.findByDateAndKeyword(startDate, endDate, keyword);
    }
    
    // 집행세부내역 전체 조회
    public List<ExecutionDetail> getExecutionDetails() {
        return executionDetailRepository.findAll();
    }
    
    // 카드번호 체크
    public boolean checkCardNum(String cardNum) {
        return departmentRepository.findByCardNum(cardNum).isPresent();
    }
}
