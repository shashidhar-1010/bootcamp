package com.example.assesweek4.service;

import com.example.assesweek4.model.Employee;
import com.example.assesweek4.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository repository;
    @Override
    public void addEmployee(Employee employee) {
        repository.save(employee);

    }

    @Override
    public List<Employee> showEmployee() {

        return repository.findAll();
    }
}
