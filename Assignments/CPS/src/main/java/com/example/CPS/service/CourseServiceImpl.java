package com.example.CPS.service;

import com.example.CPS.model.Course;
import com.example.CPS.model.Feedback;
import com.example.CPS.model.Student;
import com.example.CPS.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void addCourse(Course course) {
        courseRepository.save(course);

    }

    @Override
    public void modifyCourse(int id, Course modifiedcourse) {
        courseRepository.findById(id).ifPresent(course ->{
//            if(modifiedcourse.getCourseId() != null){
//                course.setCourseId(modifiedcourse.getCourseId());
//            }
            if(modifiedcourse.getCourseName() != null){
                course.setCourseName(modifiedcourse.getCourseName());
            }
            if(modifiedcourse.getCourseDetails() != null){
                course.setCourseDetails(modifiedcourse.getCourseDetails());
            }
            courseRepository.save(course);

        });

    }

    @Override
    public void deleteCourse(int id) {
        courseRepository.deleteById(id);

    }

    @Override
    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public List<String> getAllEnrolledStudents(int courseId) {
        return courseRepository.findById(courseId)
                .map(course -> course.getStudentsEnrolled().stream().map(Student::getStudentName).collect(Collectors.toList())).orElse(Collections.emptyList());
    }

    @Override
    public List<String> getCourseFeedback(int courseId) {

        return courseRepository.findById(courseId)
                .map(course -> course.getFeedback().stream().map(Feedback::getFeedBack).toList()).orElse(Collections.emptyList());
    }
//    @Override
//    public List<Course> getAllCourses() {
//        return courseRepository.findAll();
//    }
}
