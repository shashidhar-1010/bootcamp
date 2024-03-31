package com.assesment.springmvc.service;

import com.assesment.springmvc.dao.UserRepository;
import com.assesment.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user) {

        userRepository.save(user);
    }

    public User loginUser(String username, String password) {

        return userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

