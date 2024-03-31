package org.example.config;

import org.example.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration

public class ApplicationConfig {

    @Bean

    @Scope("prototype")

    public Person person(){
        Person p1 = new Person();
        p1.setFirstname("mike");
        p1.setLastname("reddy");
        p1.setAge(25);
        return p1;
    }
}
