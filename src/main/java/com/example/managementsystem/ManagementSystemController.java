package com.example.managementsystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagementSystemController
{
    @GetMapping("/")
    public String getLogin() {
        return "/login";
    }
    
    @GetMapping("/index")
    public String getIndex() {
        return "/index";
    }
}
