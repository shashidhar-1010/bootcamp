package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SchoolServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolServiceApplication.class,args);
    }

//    @Bean
//    public RestTemplate restTemplate () {
//        RestTemplate template = new RestTemplate();
//        return template;
//    }




}














