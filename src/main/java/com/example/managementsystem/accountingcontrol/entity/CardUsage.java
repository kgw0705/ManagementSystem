package com.example.managementsystem.accountingcontrol.entity;

import com.example.managementsystem.global.entity.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "card_usage")
public class CardUsage
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "card_usage_id")
    private String cardNum;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private String usePlace;
    private LocalDate useDate;
    private double useCost;
    private String useID;
}
