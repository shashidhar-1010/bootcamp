package com.example.CPS.controller;


import com.example.CPS.model.Course;
import com.example.CPS.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("/getall")
    public List<Course> getAllCourses() {

        return service.getAllCourses();
    }

    @PostMapping("/addcourse")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        service.addCourse(course);
        return new ResponseEntity<>("given course added", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> modifyCourse(@PathVariable int id,@RequestBody Course course){
        service.modifyCourse(id,course);
        return new ResponseEntity<>("course details changed",HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable int id){
        service.deleteCourse(id);
        return new ResponseEntity<>("course deleted",HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable int id){
        return new ResponseEntity<>(service.getCourseById(id),HttpStatus.OK);
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<List<String>> getAllEnrolledStudents(@PathVariable int id){
        return new ResponseEntity<>(service.getAllEnrolledStudents(id),HttpStatus.OK);
    }

    @GetMapping("/feedback")
    public ResponseEntity<List<String>> getCourseFeedback(int courseId){
        return new ResponseEntity<>(service.getCourseFeedback(courseId),HttpStatus.OK);

    }

}
