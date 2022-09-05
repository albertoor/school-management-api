package com.aornelass.sm.repository;

import com.aornelass.sm.models.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository
    extends MongoRepository<Subject, String> {

}
