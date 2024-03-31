package com.example.CPS.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedId;
    private String feedBack;

    @ManyToOne

    @JoinColumn(name="course_id")
    private Course course;

    @ManyToOne

    @JoinColumn(name="student_id")
    private Student student;

//    public Feedback(String feedBack, Student student, Course course){
//        this.feedBack = feedBack;
//        this.course = course;
//        this.student = student;
//    }

}
