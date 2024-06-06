package com.example.managementsystem.global.employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeDAO
{
    private final DataSource dataSource;
    
    public EmployeeDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
    
    private RowMapper<EmployeeDTO> rowMapper = (rs, rowNum) -> {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmployeeId(rs.getInt("employeeId"));
        employee.setName(rs.getString("name"));
        employee.setHireDate(rs.getDate("hireDate"));
        employee.setSalary(rs.getFloat("salary"));
        employee.setAverageWage(rs.getFloat("averageWage"));
        employee.setAnnualAllowance(rs.getFloat("annualAllowance"));
        employee.setBonus(rs.getFloat("bonus"));
        return employee;
    };
    
    public EmployeeDTO getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE employeeId = ?";
        return getJdbcTemplate().queryForObject(sql, new Object[]{id}, rowMapper);
    }
    
    public List<EmployeeDTO> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        return getJdbcTemplate().query(sql, rowMapper);
    }
    
    public int insertEmployee(EmployeeDTO employee) {
        String sql = "INSERT INTO employee (name, hireDate, salary, averageWage, annualAllowance, bonus) VALUES (?, ?, ?, ?, ?, ?)";
        return getJdbcTemplate().update(sql, employee.getName(), employee.getHireDate(), employee.getSalary(), employee.getAverageWage(), employee.getAnnualAllowance(), employee.getBonus());
    }
    
    public int updateEmployee(EmployeeDTO employee) {
        String sql = "UPDATE employee SET name = ?, hireDate = ?, salary = ?, averageWage = ?, annualAllowance = ?, bonus = ? WHERE employeeId = ?";
        return getJdbcTemplate().update(sql, employee.getName(), employee.getHireDate(), employee.getSalary(), employee.getAverageWage(), employee.getAnnualAllowance(), employee.getBonus(), employee.getEmployeeId());
    }
    
    public int deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE employeeId = ?";
        return getJdbcTemplate().update(sql, id);
    }
}
