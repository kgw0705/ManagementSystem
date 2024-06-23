package com.example.managementsystem.contract.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contract_number;

    private String contract_name;
    private String contract_address;
    private int is_Contractor_chungbuk_region;
    private String contractRequest_department;
    private String contractor_name;
    private String contract_partner_name;
    private int contract_amount;
    private Date contract_start_date;
    private Date contract_end_date;
    private int is_New_bid;
    private String contract_content;

}
