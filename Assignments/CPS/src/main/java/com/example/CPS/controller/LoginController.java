package com.example.CPS.controller;

import com.example.CPS.model.Admin;
import com.example.CPS.model.Student;
import com.example.CPS.service.AdminService;
import com.example.CPS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class LoginController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AdminService adminService;

    @GetMapping("/{role}")
    public ResponseEntity<?> loginStudent(@PathVariable String role, @RequestParam String username, @RequestParam String password) {
        if (role.equalsIgnoreCase("student")) {
            Student student = studentService.getStudentByStudentName(username);
            if (student != null && student.getPassword().equals(password)) {
                return new ResponseEntity<>("Student login successful", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid student username or password", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>("Invalid role", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{role}")
    public ResponseEntity<?> loginAdmin(@PathVariable String role, @RequestParam String username, @RequestParam String password) {
        if (role.equalsIgnoreCase("admin")) {
            Admin admin = adminService.getAdminByadminName(username);
            if (admin != null && admin.getPassword().equals(password)) {
                return new ResponseEntity<>("Admin login successful", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Invalid admin username or password", HttpStatus.UNAUTHORIZED);
            }
        } else {
            return new ResponseEntity<>("Invalid role", HttpStatus.BAD_REQUEST);
        }
    }



}
