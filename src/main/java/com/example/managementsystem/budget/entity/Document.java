package com.example.managementsystem.budget.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Data
@Entity
@Table(name= "document")
@ToString(exclude = "budgetRequest")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "budgetRequest"})
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_name")
    private String document_name;

    @Column(name = "file_path")
    private String file_path;

    @ManyToOne
    @JoinColumn(name = "request_id")
    private BudgetRequest budgetRequest;


}
