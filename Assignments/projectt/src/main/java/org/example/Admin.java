package org.example;

import java.util.*;
import java.util.Scanner;

public class Admin {
    private  String admin_id;
    private String admin_name;
    private String password;

    private Scanner s = new Scanner(System.in);
    private Map<String,course>courseList;

    public Admin(String admin_id, String admin_name, String password) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.password = password;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public List<course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<course> courseList) {
        this.courseList = courseList;
    }*/

    //login

    //add
    public String create_course(){

        System.out.println("enter the course Id:");
        String courseId =s.nextLine();
        System.out.println("enter the course name");
        String course_name = s.nextLine();
        System.out.println("enter the course details:");
        String course_details=s.nextLine();
        courseList.put(courseId,new course(courseId,course_name,this.admin_id,course_details));
        System.out.println("course added successfully");


        return courseId;
    }

    //update or modify

    public String update_course(String course_id){
        for(String x :courseList.keySet()){
            if(x.equalsIgnoreCase(course_id)){
                course update= courseList.get(x);
                System.out.println("course to be updated::");
                System.out.println(update);
                System.out.println("what to update\n1.course_id\n2.course_name\n3.course_details");
                int choice = s.nextInt();
                if(choice == 1){
                    update.setCourse_id();
                }else if(choice == 2){
                    update.setCourse_name();
                }else if(choice ==3){
                    update.setCourse_details();
                }else{
                    System.out.println("enter valid");
                }
                courseList.put(course_id,update);
                return String.valueOf(courseList.get(course_id));



            }
        }

        return "course not found";
    }

    // delete

    public String delete_course() {
        System.out.println("enter the course id to be deleated:");
        String course_id = s.nextLine();
        for (String x : courseList.keySet()) {
            if (x.equalsIgnoreCase(course_id)) {
                System.out.println("course to deleted");
                System.out.println(courseList.get(x));
                System.out.println("yes or no");
                String choice =s.nextLine();
                if(choice.equalsIgnoreCase("yes")){
                    courseList.remove(x);
                    return "course deleated "+course_id;
                }
            }
        }
        return "course not found:::";
    }

    //search

    public String search_course(){
        System.out.println("enter the course id to search:");
        String course_id = s.nextLine();
        for (String x : courseList.keySet()) {
            if (x.equalsIgnoreCase(course_id)) {
                System.out.println("course found::");
                return String.valueOf(courseList.get(x));

            }
        }
        return "course not found";
    }

    public void view_students_enrolled(){
        System.out.println("enter the course id to view the students:");
        String course_id = s.nextLine();
        boolean coursefound = false;
        for (String x : courseList.keySet()) {
            if (x.equalsIgnoreCase(course_id)) {
                coursefound = true;
                System.out.println("course found::");
                //return String.valueOf(courseList.get(x));
                List<student>studentsenrolled = courseList.get(x).getStudents_enrolled();
                for (student s : studentsenrolled){
                    System.out.println(s);
                }

            }
        }if(!coursefound){
            System.out.println("course not found");
        }

    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id='" + admin_id + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", password='" + password + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
