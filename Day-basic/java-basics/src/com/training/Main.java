package com.training;
import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Scanner s = new Scanner(System.in);

        Employee emp1 = new Employee();
        emp1.setEmpId("1334");
        emp1.setEmpName("sam");
        emp1.setSalary(34567);
        System.out.println(emp1);

        Employee emp2 = new Employee("1234","ram",3456);
        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("enter empId");
        String empId = s.next();
        System.out.println("enter empName");
        String empName = s.next();
        System.out.println("enter salary");
        double salary = s.nextDouble();

        Employee emp3 = new Employee(empId,empName,salary);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);



        }
    }