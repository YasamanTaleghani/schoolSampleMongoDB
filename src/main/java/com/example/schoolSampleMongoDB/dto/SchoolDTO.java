package com.example.schoolSampleMongoDB.dto;

import com.example.schoolSampleMongoDB.model.StudentEntity;

import java.util.List;


public class SchoolDTO {

    private String id;
    private String name;
    private String type;
    private List<StudentEntity> studentList;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<StudentEntity> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<StudentEntity> studentList) {
        this.studentList = studentList;
    }
}
