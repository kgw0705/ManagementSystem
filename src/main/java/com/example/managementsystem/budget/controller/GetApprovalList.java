package com.example.managementsystem.budget.controller;

import com.example.managementsystem.budget.entity.BudgetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Controller
@RequestMapping("/team")
public class GetApprovalList {
    @Autowired
    private SubmitSystem submitSystem;

    @GetMapping("/approvedRequests")
    public List<BudgetRequest> getApprovedList() {
        return submitSystem.getApprovedRequests();
    }

}
