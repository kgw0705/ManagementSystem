package com.example.managementsystem.accounting.entity;

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
    private String cardNum;
    private boolean approval;
    private String departmentName;
}
