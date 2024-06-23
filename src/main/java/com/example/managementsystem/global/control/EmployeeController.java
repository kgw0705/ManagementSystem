package com.example.managementsystem.global.control;

import com.example.managementsystem.global.entity.Employee;
import com.example.managementsystem.global.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController
{
    private final EmployeeService employeeService;
    
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
    @GetMapping("/getEmployee")
    public Employee getEmployee(int id) {
        return employeeService.getEmployeeById(id);
    }
    
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    @GetMapping("/createEmployee")
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }
    
    @GetMapping("/updateEmployee")
    public Employee updateEmployee(Employee employee) {
        return employeeService.updateEmployee(employee);
    }
    
    @GetMapping("/deleteEmployee")
    public void deleteEmployee(int id) {
        employeeService.deleteEmployee(id);
    }
}
