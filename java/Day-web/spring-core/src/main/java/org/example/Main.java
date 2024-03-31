package org.example;

import org.example.config.ApplicationConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        //Person p1 = (Person) context.getBean("person");

        Person p1 = (Person) context.getBean(Person.class);


        System.out.println("first name "+p1.getFirstname());
        System.out.println("age" + p1.getAge());
        System.out.println("last name "+ p1.getLastname());
        //System.out.println("firstname from constructor"+p1.getFirstname());
        //setter injection only if we have the setter only it will inject//
        //spring will create object by calling the default constructor
        //if we write the constructor the spring will not be able to create the object
        //spring always needs the no arguments constructor

        //Person p2 = (Person) context.getBean("person");
        //p2.setFirstname("michal");
        //System.out.println("p1 first name is "+ p1.getFirstname());

        //System.out.println(p1.getPersonDetails());

    }
}