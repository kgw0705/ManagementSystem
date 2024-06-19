package com.example.managementsystem;

import com.example.managementsystem.accountingcontrol.control.ExecutionDetailControl;
import com.example.managementsystem.accountingcontrol.entity.ExecutionDetail;
import com.example.managementsystem.careercontrol.control.WorkExperienceControl;
import com.example.managementsystem.careercontrol.entity.WorkExperience;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication public class ManagementSystemApplication
{
    public static void main(String[] args)
    {
//        SpringApplication.run(ManagementSystemApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(ManagementSystemApplication.class, args);
        System.out.println("Application started successfully");
        
//        testAddExecutionDetail(context);
//        testGetExecutionDetail(context);
//        testCreateWorkExperience(context);
//        testGetWorkExperience(context);
    }
    
    private static void testAddExecutionDetail(ConfigurableApplicationContext context) {
        ExecutionDetailControl executionDetailControl = context.getBean(ExecutionDetailControl.class);
        
        // Create a new ExecutionDetail object
        ExecutionDetail newExecutionDetail = new ExecutionDetail();
        newExecutionDetail.setUseTotalCost(1000);
        newExecutionDetail.setExecutionPurpose("purpose_test");
        newExecutionDetail.setCardUsageList("list_test");
        newExecutionDetail.setCardNum("12");
        newExecutionDetail.setAttendees("attendees_test");
        
        // Call the addExecutionDetail method
        executionDetailControl.addExecutionDetail(newExecutionDetail);
        
        // Print the result
        System.out.println("Added ExecutionDetail: " + newExecutionDetail);
    }
    
    private static void testGetExecutionDetail(ConfigurableApplicationContext context) {
        ExecutionDetailControl executionDetailControl = context.getBean(ExecutionDetailControl.class);
        
        // Call the getExecutionDetail method
        List<ExecutionDetail> executionDetails = executionDetailControl.getExecutionDetail();
        
        // Print the result
        for (ExecutionDetail executionDetail : executionDetails) {
            System.out.println("Retrieved ExecutionDetail id: " + executionDetail.getExecutionDetailId());
            System.out.println("Retrieved ExecutionDetail cost: " + executionDetail.getUseTotalCost());
            System.out.println("Retrieved ExecutionDetail purpose: " + executionDetail.getExecutionPurpose());
            System.out.println("Retrieved ExecutionDetail card usage list: " + executionDetail.getCardUsageList());
            System.out.println("Retrieved ExecutionDetail card number: " + executionDetail.getCardNum());
            System.out.println("Retrieved ExecutionDetail attendees: " + executionDetail.getAttendees());
            System.out.println();
        }
    }
    
    private static void testCreateWorkExperience(ConfigurableApplicationContext context) {
        WorkExperienceControl workExperienceControl = context.getBean(WorkExperienceControl.class);
        
        // Create a new WorkExperience object
        WorkExperience newWorkExperience = new WorkExperience();
        newWorkExperience.setClassification("class_test2");
        newWorkExperience.setAppointment("app_test2");
        newWorkExperience.setEducation("edu_test2");
        newWorkExperience.setWork("work_test2");
        newWorkExperience.setRating("rating_test2");
        newWorkExperience.setSeniority("sen_test2");
        newWorkExperience.setPositionExperience("poa_test2");
        newWorkExperience.setTrainingCourses("tra_test2");
        newWorkExperience.setCertificate("cer_test2");
        newWorkExperience.setPrize("priz_test2");
        newWorkExperience.setPunishment("pns_test2");
        newWorkExperience.setJobObjective("job_test2");
        
        // Call the createWorkExperience method
        WorkExperience result = workExperienceControl.createWorkExperience(3, newWorkExperience);
        
        // Print the result
        System.out.println("Created WorkExperience: " + result);
    }
    
    /*private static void testGetWorkExperience(ConfigurableApplicationContext context) {
        WorkExperienceControl workExperienceControl = context.getBean(WorkExperienceControl.class);
        WorkExperience result = workExperienceControl.getWorkExperience(2);
        System.out.println("Test WorkExperience: " + result);
    }*/
}
