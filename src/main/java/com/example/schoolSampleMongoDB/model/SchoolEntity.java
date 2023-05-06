package com.example.schoolSampleMongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("school")
public class SchoolEntity {
    @Id
    private String id;

    private String name;
    private String type;
    private List<StudentEntity> studentList;

    public SchoolEntity(String id, String name, String type, List<StudentEntity> studentList) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.studentList = studentList;
    }

    public SchoolEntity() {
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
