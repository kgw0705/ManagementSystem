package com.example.managementsystem.asset.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@Table(name = "asset")
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;

    private int asset_id;
    private String asset_type;
    private String item_code;
    private String item_name;
    private String standard;
    private int item_count;
    private int item_unit_cost;
    private int item_amount;
    private Date return_date;
}
