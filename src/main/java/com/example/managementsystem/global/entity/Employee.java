package com.example.managementsystem.global.entity;

import com.example.managementsystem.careercontrol.entity.WorkExperience;
import com.example.managementsystem.salarycontrol.entity.Salary;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private int employeeNumber;
    @OneToOne
    private WorkExperience workExperience;
    private String personnelAppointmentInfo;
    private String name;
    private String position;
    private String jobType;
    @OneToOne
    private Salary salary;
}
