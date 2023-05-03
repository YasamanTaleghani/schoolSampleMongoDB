package com.example.schoolSampleMongoDB.repository;

import com.example.schoolSampleMongoDB.model.SchoolEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolRepository extends MongoRepository<SchoolEntity, String> {

    List<SchoolEntity> findAll();

    long count();
}
