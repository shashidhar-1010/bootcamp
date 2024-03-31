package com.ps.springboot.service;

import com.ps.springboot.model.Student;
import com.ps.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository repository;
    @Override
    public void addStudent(Student student){
        repository.save(student);
    }

}
