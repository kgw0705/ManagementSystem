package com.example.managementsystem.careercontrol.entity;

import com.example.managementsystem.global.entity.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class WorkExperience
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workExperienceId;
    @ManyToOne
    private Employee employee;
    private String classification;
    @ElementCollection
    private List<String> appointment;
    @ElementCollection
    private List<String> education;
    private String work;
    private String rating;
    private String seniority;
    @ElementCollection
    private List<String> positionExperience;
    private String trainingCourses;
    @ElementCollection
    private List<String> certificate;
    @ElementCollection
    private List<String> prize;
    @ElementCollection
    private List<String> punishment;
    private String jobObjective;
}
