package com.example.Hibernateassociation.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Entity
@Table(name="USER1")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String age;
    private char gender;


    public User(String userName, String age, char gender) {
        this.userName = userName;
        this.age = age;
        this.gender = gender;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="address_id" , referencedColumnName="id")
        private Address address;
}
