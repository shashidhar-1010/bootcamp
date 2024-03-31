package com.example.Assessmentweek4.service;

import com.example.Assessmentweek4.model.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    List<Employee> showEmployee();
}
