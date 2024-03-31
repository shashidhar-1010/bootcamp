package com.ps.springboot.controller;

import com.ps.springboot.model.Student;
import com.ps.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class StudentController {

    @Autowired


    StudentService service;

    @PostMapping("/student")

    public ResponseEntity<String> addStudent (@RequestBody Student student){
        service.addStudent(student);

        //return new ResponseEntity<>(HttpStatus.CREATED); this will also work
        return new ResponseEntity<>("student added successfully",HttpStatus.CREATED);
    }
//    public void addStudent(@RequestBody Student student){
//        service.addStudent(student);
//    }
}
