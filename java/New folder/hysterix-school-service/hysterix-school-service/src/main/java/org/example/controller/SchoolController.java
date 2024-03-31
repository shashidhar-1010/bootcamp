package org.example.controller;

import org.example.intercom.StudentServiceDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchoolController {

    @Autowired
    StudentServiceDelegate delegate;

    @GetMapping("/student/{studentName}")
    public String getStudents(@PathVariable String studentName){

        return delegate.getStudentData(studentName);
    }
}



















