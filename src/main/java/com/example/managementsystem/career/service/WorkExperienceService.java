package com.example.managementsystem.career.service;

import com.example.managementsystem.career.entity.WorkExperience;
import com.example.managementsystem.career.repository.WorkExperienceRepository;
import com.example.managementsystem.global.entity.Employee;
import com.example.managementsystem.global.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkExperienceService
{
    @Autowired
    private WorkExperienceRepository workExperienceRepository;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    // 경력 생성
    public WorkExperience createWorkExperience(int employeeNumber, WorkExperience workExperience) {
        Employee employee = employeeRepository.findByEmployeeNumber(employeeNumber)
                .orElseThrow(() -> new IllegalArgumentException("Employee with number " + employeeNumber + " does not exist in Employee2 table"));
        
        if (workExperienceRepository.findByEmployeeId(employeeNumber).isPresent()) {
            throw new IllegalArgumentException("Employee with number " + employeeNumber + " already exists in work_experience table");
        }
        
        checkValidate(workExperience);
        workExperience.setEmployeeId(employee.getEmployeeNumber());
        return workExperienceRepository.save(workExperience);
    }
    
    //경력 조회
    public WorkExperience getWorkExperience(int employeeNumber) {
        return workExperienceRepository.findByEmployeeId(employeeNumber)
                .orElseThrow(() -> new IllegalArgumentException("Employee with number " + employeeNumber + " does not exist in work_experience table"));
    }
    
    // 유효성 검사
    private void checkValidate(WorkExperience workExperience) {
        if (workExperience.getClassification() == null ||
            workExperience.getAppointment() == null ||
            workExperience.getEducation() == null ||
            workExperience.getWork() == null ||
            workExperience.getRating() == null ||
            workExperience.getSeniority() == null ||
            workExperience.getPositionExperience() == null ||
            workExperience.getTrainingCourses() == null ||
            workExperience.getCertificate() == null ||
            workExperience.getPrize() == null ||
            workExperience.getPunishment() == null ||
            workExperience.getJobObjective() == null) {
            throw new IllegalArgumentException("Invalid WorkExperience data");
        }
    }
}
