package com.example.yaml.service;

public class AdditionServiceImpl implements AdditionService{
    @Override
    public int add(Integer firstNumber, Integer secondNumber) {
        return firstNumber+secondNumber;
    }
}
