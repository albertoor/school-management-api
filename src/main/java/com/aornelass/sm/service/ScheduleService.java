package com.aornelass.sm.service;

import com.aornelass.sm.models.Schedule;
import com.aornelass.sm.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository repository;


    public List<Schedule> getSchedules() {
        return repository.findAll();
    }

    public Schedule saveSchedule(Schedule schedule) {
        return repository.save(schedule);
    }

    public Schedule getSchedule(String scheduleId) {
        return repository.findById(scheduleId).get();
    }

    public void deleteSchedule(String scheduleId) {
        repository.deleteById(scheduleId);
    }

    public Schedule updateSchedule(String scheduleId, Schedule schedule) {
        Schedule scheduleToUpdate = repository.findById(scheduleId).get();

        scheduleToUpdate.setCourse(schedule.getCourse());
        scheduleToUpdate.setInstructor(schedule.getInstructor());
        scheduleToUpdate.setDays(schedule.getDays());
        scheduleToUpdate.setTimeStart(schedule.getTimeStart());
        scheduleToUpdate.setTimeEnd(schedule.getTimeEnd());
        return repository.save(scheduleToUpdate);
    }
}
