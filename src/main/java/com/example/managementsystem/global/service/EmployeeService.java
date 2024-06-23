package com.example.managementsystem.global.service;

import com.example.managementsystem.global.entity.Employee;
import com.example.managementsystem.global.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    private final EmployeeRepository employeeRepository;
    
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }
    
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}