package org.example;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MathTest {

    @Test
    @Order(1)
    @Tag("UnitTest")
    public void secondTest(){
        System.out.println("second test done");
    }

    @Test
    @Order(3)
    @Tag("IntegrateTest")
    public void firstTest(){
        System.out.println("first test done");
    }
    @Test
    @Order(2)
    public void thirdTest(){
        System.out.println("third test done");
    }
}
