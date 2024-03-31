package org.example;

import java.util.List;

public class student {

    private String student_id;
    private String student_name;
    private String password;
    private String student_details;
    private List<course> courses_enrolled;

    public student(String student_id, String student_name, String password, String student_details) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.password = password;
        this.student_details = student_details;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudent_details() {
        return student_details;
    }

    public void setStudent_details(String student_details) {
        this.student_details = student_details;
    }

    public List<course> getCourses_enrolled() {
        return courses_enrolled;
    }

    public void setCourses_enrolled(List<course> courses_enrolled) {
        this.courses_enrolled = courses_enrolled;
    }

    public String enroll_course(){
        System.out.println("enter the course id::");
        //enroll_course().add
    }

    @Override
    public String toString() {
        return "student{" +
                "student_id='" + student_id + '\'' +
                ", student_name='" + student_name + '\'' +
                ", password='" + password + '\'' +
                ", student_details='" + student_details + '\'' +
                ", courses_enrolled=" + courses_enrolled +
                '}';
    }
}

