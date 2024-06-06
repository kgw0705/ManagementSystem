package com.example.managementsystem.salary.retirement_fund;

import com.example.managementsystem.global.employee.EmployeeDAO;
import com.example.managementsystem.salary.period.PeriodDAO;

public class RetirementFundService
{
    private EmployeeDAO employeeDAO;
    private PeriodDAO periodDAO;
    
    public RetirementFundService(EmployeeDAO employeeDAO, PeriodDAO periodDAO) {
        this.employeeDAO = employeeDAO;
        this.periodDAO = periodDAO;
    }
    
}