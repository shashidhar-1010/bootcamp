package com.example.demo1.model;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User {
    private String username;
    private String password;
}
