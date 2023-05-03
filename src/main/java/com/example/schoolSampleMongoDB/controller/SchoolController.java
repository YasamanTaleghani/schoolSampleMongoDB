package com.example.schoolSampleMongoDB.controller;

import com.example.schoolSampleMongoDB.dto.SchoolDTO;
import com.example.schoolSampleMongoDB.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/getSchools")
    public List<SchoolDTO> schoolList() {
        return schoolService.getSchools();
    }

    @PostMapping(value = "/addSchool", produces = {"application/json"})
    public void addSchool(@RequestBody SchoolDTO school) {
        schoolService.saveSchool(school);
    }

    @RequestMapping(value = "/removeSchoolById/{id}", method = RequestMethod.DELETE)
    public String removeSchoolById(@PathVariable String id) {
        return schoolService.removeSchoolById(id);
    }

    @RequestMapping(value = "/updateSchool", method = RequestMethod.PUT)
    public SchoolDTO updateSchool(@RequestBody SchoolDTO school) {
        return schoolService.updateSchool(school);
    }
}
