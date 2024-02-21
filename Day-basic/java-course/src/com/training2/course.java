package com.training2;
import java.util.Scanner;
public class course {

    private String courseId;
    private String courseName;
    private int creditHours;

    public course(String courseId, String courseName , int creditHours){
        this.courseId = courseId;
        this.courseName=courseName;
        this.creditHours=creditHours;

    }

    public String getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }

    public int getCreditHours(){
        return creditHours;
    }
}
