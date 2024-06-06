package com.example.managementsystem;

import com.example.managementsystem.global.employee.EmployeeDAO;
import com.example.managementsystem.global.employee.EmployeeDTO;
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
        printAllEmployeesTest(context); // Test
    }
    
    private static void printAllEmployeesTest(ConfigurableApplicationContext context) {
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
        List<EmployeeDTO> employees = employeeDAO.getAllEmployees();
        for (EmployeeDTO employee : employees) {
            System.out.println(employee);
        }
    }
}
