package com.example.yaml.controller;

import com.example.yaml.api.AddApi;
import com.example.yaml.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AdditionController implements AddApi {
    @Autowired
    AdditionService service;

    @Override
    public ResponseEntity<Integer> addTwoNumbers(Integer firstNumber, Integer secondNumber){
        int result = service.add(firstNumber , secondNumber);
        return new ResponseEntity<Integer>(result, HttpStatus.OK);
    }
}
