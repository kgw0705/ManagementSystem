package com.example.managementsystem.global.entity;

import com.example.managementsystem.careercontrol.entity.WorkExperience;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "employee2")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private int employeeNumber;
    @OneToOne
    @JoinColumn(name = "work_experience_id")
    private WorkExperience workExperience;
    private String personnelAppointmentInfo;
    private String name;
    private String position;
    private String jobType;
}
