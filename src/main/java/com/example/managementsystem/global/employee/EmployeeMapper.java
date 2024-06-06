package com.example.managementsystem.global.employee;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<EmployeeDTO>
{
    @Override
    public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmployeeId(rs.getInt("employeeId"));
        employee.setName(rs.getString("name"));
        employee.setHireDate(rs.getDate("hireDate"));
        employee.setSalary(rs.getFloat("salary"));
        employee.setAverageWage(rs.getFloat("averageWage"));
        employee.setAnnualAllowance(rs.getFloat("annualAllowance"));
        employee.setBonus(rs.getFloat("bonus"));
        return employee;
    }
}