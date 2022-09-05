package com.aornelass.sm.controllers;

import com.aornelass.sm.models.Subject;
import com.aornelass.sm.repository.SubjectRepository;
import com.aornelass.sm.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/subjects")
public class SubjectController {

    @Autowired
    private SubjectService service;

    @GetMapping
    public List<Subject> getSubjects() {
        return service.getSubjects();
    }

    @PostMapping
    public Subject saveSubject(@RequestBody Subject subject) {
        return service.saveSubject(subject);
    }

    @GetMapping("/{subjectId}")
    public Subject getSubject(@PathVariable String subjectId) {
        return service.getSubject(subjectId);
    }

    @PutMapping("/{subjectId}")
    public Subject updateSubject(@PathVariable String subjectId,
                                 @RequestBody Subject subject) {
        return service.updateSubject(subjectId, subject);
    }

    @DeleteMapping("/{subjectId}")
    public void deleteSubject(@PathVariable String subjectId){
        service.deleteSubject(subjectId);
    }


}
