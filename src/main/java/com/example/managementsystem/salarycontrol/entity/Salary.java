package com.example.managementsystem.salarycontrol.entity;

import com.example.managementsystem.global.entity.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Salary
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salaryId;
    @ManyToOne
    private Employee employee;
    private LocalDate hireDate;
    private float salary;
    private float averageWage;
    private float annualAllowance;
    private float bonus;
}
