package com.aornelass.sm.repository;

import com.aornelass.sm.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository
    extends MongoRepository<Student, String> {
}
