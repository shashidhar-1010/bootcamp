package com.example.CPS.service;

import com.example.CPS.model.Admin;
import com.example.CPS.repository.AdminRepository;
import com.example.CPS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminRepository repository;

    @Override
    public Admin getAdminByadminName(String adminName) {
        return repository.findByadminName(adminName);
    }
}
