package com.training2;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        course[] courses ={
                new course("01","abc",2),
                new course("02","def",2),
                new course("03","ghi",2),
                new course("04","jkl",2)

        };

        Scanner s = new Scanner(System.in);
        System.out.println("enter the course id:");
        String id = s.next();

        boolean found = false;
        for(course course:courses){
            if(course.getCourseId().equalsIgnoreCase(id)){
                System.out.println("course available");
                found = true;
                break;
            }


        }
        if(!found){
            System.out.println("course not found");


    }



}