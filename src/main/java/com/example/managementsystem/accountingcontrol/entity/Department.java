package com.example.managementsystem.accountingcontrol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String cardNum;
    private boolean approval;
    private String departmentName;
}
