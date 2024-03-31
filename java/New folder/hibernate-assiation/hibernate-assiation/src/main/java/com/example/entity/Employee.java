package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="Emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "emp_project_set",
            joinColumns = {
                    @JoinColumn(name="id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name="projectId")
            }
    )
    private Set<Project> projectSet = new HashSet<>();


}













