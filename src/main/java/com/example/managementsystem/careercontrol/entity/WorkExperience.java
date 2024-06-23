package com.example.managementsystem.careercontrol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "work_experience")
public class WorkExperience
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workExperienceId;
    private int employeeId;
    private String classification;
    private String appointment;
    private String education;
    private String work;
    private String rating;
    private String seniority;
    private String positionExperience;
    private String trainingCourses;
    private String certificate;
    private String prize;
    private String punishment;
    private String jobObjective;
}
