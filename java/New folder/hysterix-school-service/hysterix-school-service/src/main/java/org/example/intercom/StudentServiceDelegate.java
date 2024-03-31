package org.example.intercom;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentServiceDelegate {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "studentServiceFallback")
    public String getStudentData(String studentName){
        template.exchange("http://localhost:8094/student/{studentName}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {

        },studentName).getBody();

        return "Normal Flow!!";


    }

    private String studentServiceFallback(){

        return "CIRCUIT BREAKER ENABLED";
    }
}


















