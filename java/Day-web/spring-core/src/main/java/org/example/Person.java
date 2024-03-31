package org.example;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

//@Data
@Scope("prototype")


public class Person {
    private String firstname;
    private String lastname;
    private int age;

    //@Autowired

    //private Car car;

    public Person( String firstname,String lastname,int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;

    }

    //public String getPersonDetails(){
        //return this.firstname +" "+ this.car.getCarDetails();
    //}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
