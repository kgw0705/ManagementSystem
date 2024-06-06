package com.example.managementsystem.global.employee;

import java.util.List;

public class EmployeeService
{
    private EmployeeDAO employeeDAO;
    
    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    
    public EmployeeDTO getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
    
    public List<EmployeeDTO> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
    
    public void createEmployee(EmployeeDTO employee) {
        employeeDAO.insertEmployee(employee);
    }
    
    public void updateEmployee(EmployeeDTO employee) {
        employeeDAO.updateEmployee(employee);
    }
    
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}