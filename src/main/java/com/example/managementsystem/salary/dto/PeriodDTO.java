package com.example.managementsystem.salary.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class PeriodDTO
{
    private Date startDate;
    private Date endDate;
}
