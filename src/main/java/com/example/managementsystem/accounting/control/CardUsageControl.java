package com.example.managementsystem.accounting.control;

import com.example.managementsystem.accounting.entity.CardUsage;
import com.example.managementsystem.accounting.service.CardUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardUsageControl
{
    private final CardUsageService cardUsageService;
    
    @Autowired
    public CardUsageControl(CardUsageService cardUsageService) {
        this.cardUsageService = cardUsageService;
    }
    
    // 카드사용내역 조회
    @GetMapping("/readCardUsageHistory/{cardNum}")
    public List<CardUsage> readCardUsageHistory(@PathVariable String cardNum) {
        return cardUsageService.readCardUsageHistory(cardNum);
    }
    
    // 카드번호 체크
    @GetMapping("/checkCardNum/{cardNum}")
    public String checkCardNum(@PathVariable String cardNum) {
        return cardUsageService.checkCardNum(cardNum) ? "Exists" : "Does not exist";
    }
}
