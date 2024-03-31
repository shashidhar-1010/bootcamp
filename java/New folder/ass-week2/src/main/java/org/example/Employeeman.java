package org.example;

import org.example.InvalidSalaryException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employeeman(){
    private List<Employee> employees;

    public Employeeman() {
        employees = new ArrayList<>();
    }

    public void addEmployee(String firstName, String lastName, double salary) throws InvalidSalaryException {
        if (salary < 50000) {
            throw new InvalidException("Salary of the employee should be greater then50,000");
        }
        employees.add(new Employee(firstName, lastName, salary));
    }

    public Employee getEmployeeWithHighSalary() {
        if (employees.isEmpty()) {
            return null;
        }
        return Collections.max(employees, Comparator.comparingDouble(Employee::getSalary));
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public InvalidException getEmployee(String firstName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName)) {
                return employee;
            }
        }
        return null;
    }
}
