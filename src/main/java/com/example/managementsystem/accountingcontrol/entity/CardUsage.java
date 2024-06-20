package com.example.managementsystem.accountingcontrol.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private String useId;
    @ManyToOne
    @JoinColumn(name = "cardNum")
    @JsonBackReference
    private ExecutionDetail executionDetail;
    private String usePlace;
    private LocalDate useDate;
    private double useCost;
}