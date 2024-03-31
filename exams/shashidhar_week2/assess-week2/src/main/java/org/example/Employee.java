package org.example;

public class Employee {

    String name;
    int salary;
    int id;

    public Employee(String name, int salary, int id) throws BadEmployeeException {
        if (salary< 50000) {
            throw new BadEmployeeException("Salary is less than 50,000");
        }
        if (id < 1) {
            throw new BadEmployeeException("Id cannot be 0 or negative");
        }
        this.name=name;
        this.salary=salary;
        this.id=id;
    }

    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

}
