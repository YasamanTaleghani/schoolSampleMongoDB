package com.example.schoolSampleMongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("course")
public class Course {

    @Id
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
