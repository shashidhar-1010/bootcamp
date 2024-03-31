package org.example.model;


public class Student {

    private String studentName;
    private String className;

    public Student(String studentName, String className) {
        this.studentName = studentName;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
