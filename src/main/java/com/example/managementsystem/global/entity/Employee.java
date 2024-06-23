package com.example.managementsystem.global.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employee2")
public class Employee
{
    @Id
    private int employeeNumber;
    private int workExperienceId;
    private String personnelAppointmentInfo;
    private String name;
    private String position;
    private String jobType;
}
