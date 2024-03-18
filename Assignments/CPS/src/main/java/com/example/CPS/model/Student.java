package com.example.CPS.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
//@Table(name="Student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String password;
//    private String studentDetails;


    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name = "course_id"))
    private HashSet<Course> coursesEnrolled = new HashSet<Course>();
}
