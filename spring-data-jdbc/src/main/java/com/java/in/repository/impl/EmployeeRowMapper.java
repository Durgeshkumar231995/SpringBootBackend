package com.java.in.repository.impl;

import org.springframework.jdbc.core.RowMapper;

import com.java.in.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Employee.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .dept(rs.getString("dept"))
                .email(rs.getString("email"))
                .doj(rs.getDate("doj"))
                .build();
    }
}
