package org.example.controller;

import org.example.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {




    public List<Student> addStudent(Student student){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tim","Class-T"));
        return studentList;
    }
}
