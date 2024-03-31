package org.example;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class course {
    private String course_id;
    private String course_name;
    private String course_details;

    private Map<String,String> feedback;

    private Scanner s = new Scanner(System.in);

    private String admin_id;
    private List<student> students_enrolled;

    public course(String course_id, String course_name, String course_details, String courseDetails) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_details = course_details;
        //this.feedback = feedback;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id() {
        System.out.println("enter new values:");
        String course_id = s.nextLine();
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name() {
        System.out.println("enter new course name:");
        String course_name = s.nextLine();
        //this.course_id = course_id;
        this.course_name = course_name;
    }

    public String getCourse_details() {
        return course_details;
    }

    public void setCourse_details() {
        System.out.println("enter new values:");
        String course_details= s.nextLine();
        //this.course_id = course_id;
        this.course_details = course_details;
    }

    public List<student> getStudents_enrolled() {
        return students_enrolled;
    }

    public void setStudents_enrolled(List<student> students_enrolled) {
        this.students_enrolled = students_enrolled;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;

    }

    public String getFeedback() {
        return  feedback.get(this.course_id);
    }

    public void setFeedback(String feedback,String student_id) {
        this.feedback.put(student_id,feedback);
    }

    public void get_student_feedback(){
        System.out.println("enter student id");
        String student_id = s.nextLine();
        System.out.println("give feedback to course"+ "" +this.course_name+""+this.course_id);
        String feedback = s.nextLine();
        setFeedback(student_id,feedback);
        System.out.println("thanks");

    }
}
