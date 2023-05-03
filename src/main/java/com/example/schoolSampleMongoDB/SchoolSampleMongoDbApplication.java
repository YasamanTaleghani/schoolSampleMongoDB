package com.example.schoolSampleMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class SchoolSampleMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolSampleMongoDbApplication.class, args);
	}
}
