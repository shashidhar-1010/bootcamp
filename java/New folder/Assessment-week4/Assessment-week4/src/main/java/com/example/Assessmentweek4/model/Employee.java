package com.example.Assessmentweek4.model;
import jakarta.persistence.*;
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
