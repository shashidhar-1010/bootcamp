package org.example;


public class Main {
    public static void main(String[] args) throws BadEmployeeException {

        System.out.println("Hello world!");
        EmployeeManager employeeManager = new EmployeeManager();
        System.out.println("Employee with highest salary : "+ employeeManager.getHighestSalary());
    }


}