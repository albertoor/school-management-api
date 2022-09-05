package com.aornelass.sm.repository;

import com.aornelass.sm.models.Instructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository
    extends MongoRepository<Instructor, String> {

}
