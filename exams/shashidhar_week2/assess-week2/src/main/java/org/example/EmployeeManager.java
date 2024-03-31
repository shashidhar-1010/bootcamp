package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {

    List<Employee> employees;

    public EmployeeManager() throws BadEmployeeException {
        List<Employee> employees = new ArrayList<>(6);
        Employee emp1 = new Employee("A", 50000,1);
        Employee emp2 = new Employee("B", 500000,2);
        Employee emp3 = new Employee("C", 60000,3);
        Employee emp4 = new Employee("D", 80000,4);
        Employee emp5 = new Employee("E", 90000,5);
        Employee emp6 = new Employee("F", 200000,6);
        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6));
        this.employees = employees;
    }
    public List<Employee> getEmployees() {
        return this.employees;
    }

    public int getHighestSalary() {
        int highestSalary = Integer.MIN_VALUE;
        for (Employee employee : this.employees) {
            highestSalary = Math.max(highestSalary, employee.getSalary());
        }
        return highestSalary;
    }
}