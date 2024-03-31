package org.example;

import org.example.entity.employee;
import org.example.util.hibernateutil;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("hello everyone::::");
        employee emp1 = new employee("shashi","dev");

        Session session = hibernateutil.getSessionFactory().getCurrentSession();

        //start transaction

        session.beginTransaction();

        //save transaction
        session.save(emp1);

        //commit transaction
        session.getTransaction().commit();

        hibernateutil.getSessionFactory().close();

    }
}