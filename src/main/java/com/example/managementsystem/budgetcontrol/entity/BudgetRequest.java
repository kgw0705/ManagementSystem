package com.example.managementsystem.budgetcontrol.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter

@Table(name = "budget_request")
public class BudgetRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "total_amount")
    private float totalAmount;

    @Column(name = "status")
    private String status = "승인대기";

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "budgetRequest",orphanRemoval = true)
    private List<BudgetItem> budgetItems = new ArrayList<>();

    public void addBudgetItem(BudgetItem budgetItem) {
        budgetItem.setBudgetRequest(this);
        this.budgetItems.add(budgetItem);
    }

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "budgetRequest" , orphanRemoval = true)
    private List<Document> documents = new ArrayList<>();


    public void addDocuments(Document document) {

        document.setBudgetRequest(this);
        this.documents.add(document);

    }




}
