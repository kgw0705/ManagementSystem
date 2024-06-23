package com.example.managementsystem.budgetcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class MainController {

    @GetMapping("/user/userpage")
    public String userPage() {
        return "UserPage";
    }

    @GetMapping("user/submitpage")
    public String submitPage() {
        return "submitPage";
    }

    @GetMapping("team/approvalList")
    public String approvalList() {
        return "GetApprovalList";
    }

    @GetMapping("/team/budget")
    public String BudgetTeamPage() {
        return "BudgetTeamPage";
    }


}
