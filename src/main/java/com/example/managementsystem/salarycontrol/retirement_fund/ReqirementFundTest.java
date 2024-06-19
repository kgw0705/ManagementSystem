package com.example.managementsystem.salarycontrol.retirement_fund;

import com.example.managementsystem.ManagementSystemApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ReqirementFundTest
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(ManagementSystemApplication.class, args);
        testProcessCalculation(context);
    }
    
    public static void testProcessCalculation(ConfigurableApplicationContext context) {
        /*// Create instances of EmployeeDAO and PeriodDAO
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
        PeriodDAO periodDAO = context.getBean(PeriodDAO.class);
        
        // Create an instance of RetirementFundService
        RetirementFundService retirementFundService = new RetirementFundService(employeeDAO, periodDAO);
        
        // Create an instance of RetirementFundController
        RetirementFundController retirementFundController = new RetirementFundController(retirementFundService);
        
        // Call the processCalculation method with employeeId 1
        retirementFundController.processCalculation(1);*/
    }
}