package com.example.CPS.controller;

import com.example.CPS.model.Course;
import com.example.CPS.model.Feedback;
import com.example.CPS.model.Student;
import com.example.CPS.repository.CourseRepository;
import com.example.CPS.repository.FeedbackRepository;
import com.example.CPS.repository.StudentRepository;
import com.example.CPS.service.CourseService;
import com.example.CPS.service.FeedbackService;
import com.example.CPS.service.StudentService;
//import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentService service;

    @Autowired
    CourseService courseService;

    @Autowired
    FeedbackService feedbackService;




//    @PostMapping("/studentenroll")
//    public ResponseEntity<String> enrollCourse(@RequestBody Student student , Course course){
//        service.enrollCourse(student , course);
//        return new ResponseEntity<>("course enrolled Successfully", HttpStatus.CREATED);
//    }
//    @GetMapping("/getCourse")
//    public List<Student> getEnrolledCourses(){
//        return service.getAllEnrolledCourses();
//    }
    @GetMapping("/viewstudents")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = service.getStudents();
        return new ResponseEntity<>(students , HttpStatus.OK);

    }

    @PostMapping("/addstudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        service.Student(student);
        return new ResponseEntity<>("successfully added the student",HttpStatus.CREATED);
    }

    @PostMapping("/enroll")
    public ResponseEntity<String> enrollCourse(@RequestBody Map<String,Integer> requestBody) {
        int studentId= requestBody.get("studentId");
        int courseId= requestBody.get("courseId");

        Student student = service.getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);
        if (student != null && course != null) {
            if (!course.getStudentsEnrolled().contains(student)) {
                course.getStudentsEnrolled().add(student);
                courseService.modifyCourse(courseId, course);
                student.getCoursesEnrolled().add(course);
                service.Student(student);
                return new ResponseEntity<>("student enrolled in course", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("student or course is missing", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/studentfeedback")
    public ResponseEntity<String> giveFeedback(int studentId , int courseId, @RequestBody String feedback){
        Student student = service.getStudentById(studentId);
        Course course = courseService.getCourseById(courseId);
        if(student != null && course != null && course.getStudentsEnrolled().contains(student) && feedback != null){
//            Feedback newfeedback = new Feedback(feedback , student , course);
//            feedbackService.giveFeedback(newfeedback);
//            course.getFeedback().add(newfeedback);
            feedbackService.giveFeedback(studentId,courseId,feedback);
            courseService.modifyCourse(courseId , course);
            return new ResponseEntity<>("feedback given",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("not found",HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/coursesenrolled")
    public ResponseEntity<Set<Course>> getCoursesEnrolled(int id){
        Student student = service.getStudentById(id);
        if(student != null){
            Set<Course> coursesEnrolled = student.getCoursesEnrolled();
            return new ResponseEntity<>(coursesEnrolled,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }





}






