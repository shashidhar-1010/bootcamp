package com.example.CPS.service;

import com.example.CPS.model.Course;
import com.example.CPS.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

//    ResponseEntity<String> enrollCourse(int studentId, int courseId);

    List<Student> getStudents();

    Student getStudentById(int id);

    public void Student(Student student);

    public Student getStudentByStudentName(String studentName);

//    public void enrollCourse(Student student, Course course);

//    List<Student> getEnrolledCourses();


}
