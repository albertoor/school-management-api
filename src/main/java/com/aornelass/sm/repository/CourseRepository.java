package com.aornelass.sm.repository;

import com.aornelass.sm.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository
    extends MongoRepository<Course, String> {
}
