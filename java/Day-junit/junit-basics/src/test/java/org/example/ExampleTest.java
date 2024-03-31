package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    @Tag("IntegrationTest")
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

}
