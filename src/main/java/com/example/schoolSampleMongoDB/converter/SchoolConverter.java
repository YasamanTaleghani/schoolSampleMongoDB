package com.example.schoolSampleMongoDB.converter;

import com.example.schoolSampleMongoDB.dto.SchoolDTO;
import com.example.schoolSampleMongoDB.model.SchoolEntity;
import org.springframework.stereotype.Component;

@Component
public class SchoolConverter {

    public SchoolEntity convertDTOToEntity(SchoolDTO schoolDTO) {
        SchoolEntity schoolEntity = new SchoolEntity();
        schoolEntity.setId(schoolDTO.getId());
        schoolEntity.setName(schoolDTO.getName());
        schoolEntity.setType(schoolDTO.getType());
        schoolEntity.setStudentList(schoolDTO.getStudentList());

        return schoolEntity;
    }

    public SchoolDTO convertEntityToDTO (SchoolEntity schoolEntity) {
        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId(schoolEntity.getId());
        schoolDTO.setName(schoolEntity.getName());
        schoolDTO.setType(schoolEntity.getType());
        schoolDTO.setStudentList(schoolEntity.getStudentList());

        return schoolDTO;
    }
}
