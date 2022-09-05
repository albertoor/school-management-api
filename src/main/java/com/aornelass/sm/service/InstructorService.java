package com.aornelass.sm.service;

import com.aornelass.sm.models.Instructor;
import com.aornelass.sm.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository repository;

    public List<Instructor> getAllInstructors() {
        return repository.findAll();
    }

    public Instructor getInstructor(String instructorId) {
        return repository.findById(instructorId).get();
    }

    public Instructor saveInstructor(Instructor instructor) {
        return repository.save(instructor);
    }

    public void deleteInstructor(String instructorId) {
        repository.deleteById(instructorId);
    }

    public Instructor updateInstructor(String instructorId,
                                       Instructor instructor) {
        Instructor instructorToUpdate =
            repository.findById(instructorId).get();

        instructorToUpdate.setFName(instructor.getFName());
        instructorToUpdate.setLName(instructor.getLName());
        instructorToUpdate.setGender(instructor.getGender());
        instructorToUpdate.setEmail(instructor.getEmail());
        instructorToUpdate.setPassword(instructor.getPassword());
        instructorToUpdate.setPhone(instructor.getPhone());
        instructorToUpdate.setDob(instructor.getDob());
        instructorToUpdate.setCourses(instructor.getCourses());

        return repository.save(instructorToUpdate);
    }

}
