package com.example.CPS.service;

import com.example.CPS.model.Course;

import java.util.List;

public interface CourseService {

//    List<Course> getAllCourses();

    void addCourse(Course course);

    void modifyCourse(int id, Course course);

    void deleteCourse(int id);

    Course getCourseById(int id);

    List<String> getAllEnrolledStudents(int courseId);


    List<String> getCourseFeedback(int courseId);

    public List<Course> getAllCourses();


}
