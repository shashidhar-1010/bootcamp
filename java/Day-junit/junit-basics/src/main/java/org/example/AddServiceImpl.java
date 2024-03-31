package org.example;

import java.sql.SQLOutput;

public class AddServiceImpl implements AddService{

    @Override
    public int add(int n1, int n2) {
        System.out.println("add service executed:::::");
        return n1+n2;
    }
}
