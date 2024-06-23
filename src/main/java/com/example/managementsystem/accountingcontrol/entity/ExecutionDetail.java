package com.example.managementsystem.accountingcontrol.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "execution_detail")
public class ExecutionDetail
{
    @Id
    private String cardNum;
    private double useTotalCost;
    private String executionPurpose;
    @OneToMany(mappedBy = "executionDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CardUsage> cardUsageList;
    private String attendees;
}
