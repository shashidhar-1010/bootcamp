package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    @Tag("UnitTest")
    public void newTest1(){
        System.out.println("new test 1");


    }

    @Test
    public void newTest2(){
        System.out.println("new test 2");


    }
}
