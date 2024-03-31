package com.ps.springboot.controller;

import com.ps.springboot.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //@Controller + @ResponseBody
@RequestMapping("/")

public class HomeController {

    @GetMapping
    //@ResponseBody no need to write this if we use restcontroller
//    public String sayHi(){
//        System.out.println("inside home controller");
//        return " hello everyone!!!!";
//    }

    public List<Product> sayHi(){
        System.out.println("inside home controller");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101,"fridge","LG",500));
        productList.add(new Product(102,"TV","SONG",700));

        return productList;
    }

}
