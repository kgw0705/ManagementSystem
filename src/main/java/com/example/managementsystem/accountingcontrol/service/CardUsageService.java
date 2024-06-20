package com.example.managementsystem.accountingcontrol.service;

import com.example.managementsystem.accountingcontrol.entity.CardUsage;
import com.example.managementsystem.accountingcontrol.repository.CardUsageRepository;
import com.example.managementsystem.accountingcontrol.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardUsageService
{
    private final CardUsageRepository cardUsageRepository;
    private final DepartmentRepository departmentRepository;
    
    @Autowired
    public CardUsageService(CardUsageRepository cardUsageRepository,  DepartmentRepository departmentRepository) {
        this.cardUsageRepository = cardUsageRepository;
        this.departmentRepository = departmentRepository;
    }
    
    // 카드사용내역 조회
    public List<CardUsage> readCardUsageHistory(String cardNum) {
        if (checkCardNum(cardNum)) {
            return cardUsageRepository.findByExecutionDetail_CardNum(cardNum);
        } else {
            throw new IllegalArgumentException("Invalid card number");
        }
    }
    
    // 카드번호 체크
    public boolean checkCardNum(String cardNum) {
        return departmentRepository.findByCardNum(cardNum).isPresent();
    }
}