package com.example.managementsystem.salarycontrol.period;

import org.springframework.stereotype.Repository;

@Repository
public class PeriodDAO
{
    /*private EmployeeDAO employeeDAO;
    
    public PeriodDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    
    public long getWorkingDays(int employeeId) {
        Employee employee = employeeDAO.getEmployeeById(employeeId);
        LocalDate hireDate = employee.getHireDate();
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.DAYS.between(hireDate, currentDate);
    }*/
}
