package com.example.managementsystem.global.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class EmployeeDTO
{
    private int employeeId;
    private String name;
    private Date hireDate;
    private float salary;
    private float averageWage;
    private float annualAllowance;
    private float bonus;
}
