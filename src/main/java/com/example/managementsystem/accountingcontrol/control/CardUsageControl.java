package com.example.managementsystem.accountingcontrol.control;

import org.springframework.web.bind.annotation.*;

@RestController
public class CardUsageControl
{
    // 카드사용내역 조회
    @GetMapping("/readCardUsageHistory/{cardNum}")
    public void readCardUsageHistory(@PathVariable String cardNum) {
        // Here you can add the logic to read card usage history based on card number
    }
}
