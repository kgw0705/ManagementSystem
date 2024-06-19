package com.example.managementsystem.careercontrol.control;

import com.example.managementsystem.careercontrol.entity.WorkExperience;
import com.example.managementsystem.careercontrol.service.WorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WorkExperienceControl
{
    @Autowired
    private WorkExperienceService workExperienceService;
    
    // 경력 생성
    @PostMapping("/createWorkExperience/{employeeNumber}")
    public WorkExperience createWorkExperience(@PathVariable int employeeNumber, @RequestBody WorkExperience workExperience) {
        return workExperienceService.createWorkExperience(employeeNumber, workExperience);
    }
    
    // 경력 조회
    @GetMapping("/getWorkExperience/{employeeNumber}")
    public WorkExperience getWorkExperience(@PathVariable int employeeNumber) {
        return workExperienceService.getWorkExperience(employeeNumber);
    }
}
