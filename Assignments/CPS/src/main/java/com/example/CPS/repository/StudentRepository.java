package com.example.CPS.repository;

import com.example.CPS.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



public interface StudentRepository extends JpaRepository<Student,Integer> {



}
