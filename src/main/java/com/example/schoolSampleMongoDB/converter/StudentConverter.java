package com.example.schoolSampleMongoDB.converter;

import com.example.schoolSampleMongoDB.dto.SchoolDTO;
import com.example.schoolSampleMongoDB.dto.StudentDTO;
import com.example.schoolSampleMongoDB.model.StudentEntity;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

    public StudentDTO convertStudentEntityToDTO (StudentEntity studentEntity) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(studentEntity.getId());
        if (studentEntity.getName() != null) {
            studentDTO.setName(studentEntity.getName());
        }
        if (studentEntity.getAge() != null) {
            studentDTO.setAge(studentEntity.getAge());
        }
        if (studentEntity.getGrade() != null) {
            studentDTO.setGrade(studentEntity.getGrade());
        }
        if (studentEntity.getAverage() != null) {
            studentDTO.setAverage(studentEntity.getAverage());
        }
        if (studentEntity.getCourseList() != null && studentEntity.getCourseList().size() > 0) {
            studentDTO.setCourseList(studentEntity.getCourseList());
        }
        return studentDTO;
    }

    public StudentEntity convertStudentDTOToEntity (StudentDTO studentDTO) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(studentDTO.getId());
        studentEntity.setName(studentDTO.getName());
        studentEntity.setAge(studentDTO.getAge());
        studentEntity.setGrade(studentDTO.getGrade());
        studentEntity.setAverage(studentDTO.getAverage());
        studentEntity.setCourseList(studentDTO.getCourseList());

        return studentEntity;
    }
}
