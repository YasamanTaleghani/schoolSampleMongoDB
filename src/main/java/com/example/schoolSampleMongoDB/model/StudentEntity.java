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

    public StudentEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
