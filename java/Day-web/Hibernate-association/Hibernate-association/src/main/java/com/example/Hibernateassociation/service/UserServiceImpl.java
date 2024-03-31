package com.example.Hibernateassociation.service;

import com.example.Hibernateassociation.Repository.UserRepository;
import com.example.Hibernateassociation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public void addUser(User user) {
        repository.save(user);

    }

//    @Override
//    public void addUser(User user) {
//
//    }
}