package com.example.CPS.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
//@Table(name="Courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private String courseDetails;
//    private String adminId;

//    @ManyToMany(mappedBy = "coursesEnrolled")
//    @JsonIgnore
//    private Set<Student> enrolledStudentSet = new HashSet<>();


    private Set<Feedback> feedback = new HashSet<Feedback>();
    private Set<Student> studentsEnrolled = new HashSet<Student>();
}
