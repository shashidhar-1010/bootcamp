package com.example.CPS.service;

import com.example.CPS.model.Course;
import com.example.CPS.model.Student;
import com.example.CPS.repository.CourseRepository;
import com.example.CPS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repository;

    @Autowired
    CourseRepository courseRepository;


//    @Override
//    public ResponseEntity<String> enrollCourse(int studentId, int courseId) {
//        Student student = repository.findById(studentId).get();
//        Course course = courseRepository.findById(courseId).get();
//        student.enrollCourse().add(course);
//        repository.save(student);
//        return ResponseEntity.ok("student enrolled to the course successfully") ;
//    }

    @Override
    public List<Student> getStudents() {

        return repository.findAll();
    }

    @Override
    public Student getStudentById(int id) {

        return repository.findById(id).orElse(null);
    }

    @Override
    public void Student(Student student) {
        repository.save(student);

    }

    @Override
    public Student getStudentByStudentName(String studentName) {
        return repository.findByStudentName(studentName);

    }
}
