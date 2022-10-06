package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();
}
