package com.aornelass.sm.controllers;

import com.aornelass.sm.models.Instructor;
import com.aornelass.sm.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
public class InstructorController {

    @Autowired
    private InstructorService service;

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return service.getAllInstructors();
    }

    @GetMapping("/{instructorId}")
    public Instructor getInstructor(@PathVariable String instructorId){
        return service.getInstructor(instructorId);
    }

    @PostMapping
    public Instructor saveInstructor(@RequestBody Instructor student) {
        return service.saveInstructor(student);
    }

    @DeleteMapping("/{instructorId}")
    public void deleteInstructor(@PathVariable String instructorId){
        service.deleteInstructor(instructorId);
    }

    @PutMapping("/{instructorId}")
    public Instructor updateInstructor(@PathVariable String instructorId,
                                 @RequestBody Instructor student){
        return service.updateInstructor(instructorId, student);
    }
}
