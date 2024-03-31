package com.example.assesweek4.service;

import com.example.assesweek4.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    List<Employee> showEmployee();
}
