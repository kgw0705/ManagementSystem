package com.example.managementsystem.salary.retirement_fund;

import com.example.managementsystem.global.employee.EmployeeDTO;
import com.example.managementsystem.salary.period.PeriodDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class RetirementFundDTO
{
    private int fundID;
    private EmployeeDTO employee;
    private String fundType;
    private Date startDate;
    private Date endDate;
    private PeriodDTO excludePeriod;
    private float baseAmount;
    private float finalAmount;
    private float taxAmount;
}
