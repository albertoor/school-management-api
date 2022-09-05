package com.aornelass.sm.repository;

import com.aornelass.sm.models.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository
    extends MongoRepository<Schedule, String> {
}
