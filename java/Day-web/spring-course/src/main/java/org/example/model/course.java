package org.example.model;

import jakarta.xml.bind.annotation.XmlID;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@Entity


public class course {


    private String courseId;
    private String courseName;
    private String courseDesc;
    private int courseDur;

    public course(String courseId, String courseName, String courseDesc, int courseDur) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.courseDur = courseDur;
    }
}
