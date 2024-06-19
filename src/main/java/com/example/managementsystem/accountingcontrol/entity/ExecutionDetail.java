package com.example.managementsystem.accountingcontrol.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "execution_detail")
public class ExecutionDetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int executionDetailId;
    private double useTotalCost;
    private String executionPurpose;
    private String cardUsageList;
    private String cardNum;
    private String attendees;
}
