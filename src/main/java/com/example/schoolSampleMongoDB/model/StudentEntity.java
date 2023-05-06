package com.example.schoolSampleMongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("student")
public class StudentEntity {

    @Id
    private String id;

    private String name;
    private Integer age = 7;
    private String grade;
    private String average;
    private List<Course> courseList;

    public StudentEntity(String id, String name, Integer age, String grade, String average, List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.average = average;
        this.courseList = courseList;
    }
}