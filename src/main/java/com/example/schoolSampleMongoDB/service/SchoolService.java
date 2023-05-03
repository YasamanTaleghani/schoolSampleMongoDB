package com.example.schoolSampleMongoDB.service;

import com.example.schoolSampleMongoDB.converter.SchoolConverter;
import com.example.schoolSampleMongoDB.dto.SchoolDTO;
import com.example.schoolSampleMongoDB.model.SchoolEntity;
import com.example.schoolSampleMongoDB.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private SchoolConverter schoolConverter;

    public List<SchoolDTO> getSchools() {
        List<SchoolEntity> schoolEntities = schoolRepository.findAll();
        List<SchoolDTO> schoolDTOS = new ArrayList<>();
        for (SchoolEntity school : schoolEntities) {
            SchoolDTO schoolDTO = schoolConverter.convertEntityToDTO(school);
            schoolDTOS.add(schoolDTO);
        }
        return schoolDTOS;
    }

    public void saveSchool(SchoolDTO school) {
        SchoolEntity schoolEntity = schoolConverter.convertDTOToEntity(school);
        schoolRepository.insert(schoolEntity);
    }

    public String removeSchoolById(String id) {
        if (schoolRepository.findById(id).isPresent()) {
            schoolRepository.deleteById(id);
            return "Successfully done!";
        }
        return "Change is not possible!";
    }

    public SchoolDTO updateSchool(SchoolDTO school) {
        if (schoolRepository.findById(school.getId()).isPresent()) {
            SchoolEntity schoolEntity = schoolRepository.findById(school.getId()).get();
            schoolEntity.setName(school.getName());
            schoolEntity.setType(school.getType());
            schoolEntity.setStudentList(school.getStudentList());
            schoolRepository.save(schoolEntity);
            return schoolConverter.convertEntityToDTO(schoolEntity);
        }
        return new SchoolDTO();
    }
}
