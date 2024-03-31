package com.example.assesweek4.controller;


import com.example.assesweek4.model.Employee;
import com.example.assesweek4.repository.EmployeeRepository;
import com.example.assesweek4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")

public class EmployeeController {

    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeRepository repository;

    @PostMapping("/employee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
        service.addEmployee(emp);
        return new ResponseEntity<>("employee Added Successfully", HttpStatus.CREATED);
    }
    @GetMapping("/getemp")
    public List<Employee> getEmp(){
        return service.showEmployee();
    }
}
