package com.aornelass.sm.controllers;

import com.aornelass.sm.models.Student;
import com.aornelass.sm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable String studentId){
        return service.getStudent(studentId);
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable String studentId){
        service.deleteStudent(studentId);
    }

    @PutMapping("/{studentId}")
    public Student updateStudent(@PathVariable String studentId,
                                 @RequestBody Student student){
        return service.updateStudent(studentId, student);
    }
}
