package org.example.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Data
//@AllArgsConstructor
//@NoArgsConstructor


public class user {
    private int id;
    private String name;
    private String role;
    private boolean isEmployee;

    public user(int id, String name, String role, boolean isEmployee) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.isEmployee = isEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }
}
