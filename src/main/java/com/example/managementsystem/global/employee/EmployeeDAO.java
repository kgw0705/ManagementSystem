package com.example.managementsystem.global.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class EmployeeDAO
{
    private final DataSource dataSource;
    private final EmployeeMapper employeeMapper;
    
    @Autowired
    public EmployeeDAO(DataSource dataSource, EmployeeMapper employeeMapper) {
        this.dataSource = dataSource;
        this.employeeMapper = employeeMapper;
    }
    
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(dataSource);
    }
    
    public EmployeeDTO getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE employeeId = ?";
        return getJdbcTemplate().queryForObject(sql, new Object[]{id}, employeeMapper);
    }
    
    public List<EmployeeDTO> getAllEmployees() {
        String sql = "SELECT * FROM employee";
        return getJdbcTemplate().query(sql, employeeMapper);
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
