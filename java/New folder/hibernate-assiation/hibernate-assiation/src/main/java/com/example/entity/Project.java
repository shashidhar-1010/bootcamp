package com.example.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "projectSet")
    private Set<Employee> employeeSet = new HashSet<>();


}
