package com.example.CPS.service;

import com.example.CPS.model.Admin;

public interface AdminService {
//    void createCourse(String courseId , String courseName);
//    void ModifyCourse(String courseId , String newCourseName);
//    String searchCourse(String courseId);
//    void deleteCourse(String courseId);
//    List<String> viewEnrolledStudents(String courseId);
public Admin getAdminByadminName(String adminName);

}
