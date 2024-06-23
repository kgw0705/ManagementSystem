package com.example.managementsystem.budget.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Data
@Getter
@Setter
@ToString(exclude = "budgetRequest")
@Table(name= "budget_item")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "budgetRequest"})
public class BudgetItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category")
    private String category;

    @Column(name="sub_category")
    private String subcategory;
    @Column(name = "allocated_category")
    private float allocated_amount;
    @Column(name = "executed_amount")
    private float executed_amount;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private BudgetRequest budgetRequest;


}

