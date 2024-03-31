package com.ps.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity

public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long studId;
    private String studName;
    private int age;
    private String grade;

    public  Student(String studName, int age , String grade){
        this.studName=studName;
        this.age=age;
        this.grade=grade;
    }
}
