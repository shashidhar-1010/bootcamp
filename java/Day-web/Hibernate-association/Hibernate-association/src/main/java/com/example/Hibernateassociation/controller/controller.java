package com.example.Hibernateassociation.controller;

import com.example.Hibernateassociation.entity.User;
import com.example.Hibernateassociation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController //@Controller + @ResponseBody
@RequestMapping("/")
public class controller {

    @Autowired
    UserService service;

    @PostMapping("/add")
    public ResponseEntity<String> adduser(@RequestBody User user){
        service.addUser(user);
        return new ResponseEntity<>("useradded", HttpStatus.CREATED);
    }

    //@ResponseBody no need to write this if we use restcontroller
//    public String sayHi(){
//        System.out.println("inside home controller");
//        return " hello everyone!!!!";
//    }

//    public List<User> sayHi(){
//        System.out.println("inside home controller");
//        List<User> UserList = new ArrayList<>();
//        UserList.add(new User("shashi","22",'M'));
//        UserList.add(new User("ravi","22",'M'));
//
//        return UserList;
//    }
}
