package com.example.springboot.cruddemo.dao;

import com.example.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> findAll();

    public Employee findById(int id);

    public void save(Employee employee);

    public void deleteById(int id);
}
