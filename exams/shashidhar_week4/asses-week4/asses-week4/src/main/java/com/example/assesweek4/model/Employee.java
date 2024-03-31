package com.example.assesweek4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
//@Table(name="Employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="emp_Id")
    private long empId;
    private String empName;
    private int empAge;
    private String empSalary;

    public Employee(String empName, int age, String salary){
        this.empName = empName;
        this.empAge = age;
        this.empSalary = salary;
    }
}
