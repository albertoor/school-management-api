package com.aornelass.sm.controllers;

import com.aornelass.sm.models.Schedule;
import com.aornelass.sm.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedules")
public class ScheduleController {

    @Autowired
    private ScheduleService service;

    @GetMapping
    public List<Schedule> getSchedules(){
        return service.getSchedules();
    }

    @PostMapping
    public Schedule saveSchedule(@RequestBody Schedule schedule) {
        return service.saveSchedule(schedule);
    }

    @GetMapping("/{scheduleId}")
    public Schedule getSchedule(@PathVariable String scheduleId){
        return service.getSchedule(scheduleId);
    }

    @DeleteMapping("/{scheduleId}")
    public void deleteSchedule(@PathVariable String scheduleId){
        service.deleteSchedule(scheduleId);
    }

    @PutMapping("/{scheduleId}")
    public Schedule updateSchedule(@PathVariable String scheduleId,
                                   @RequestBody Schedule schedule) {
        return service.updateSchedule(scheduleId, schedule);
    }
}
