package com.aornelass.sm.service;

import com.aornelass.sm.models.Subject;
import com.aornelass.sm.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository repository;

    public List<Subject> getSubjects() {
        return repository.findAll();
    }

    public Subject saveSubject(Subject subject) {
        return repository.save(subject);
    }

    public Subject getSubject(String subjectId) {
        return repository.findById(subjectId).get();
    }

    public Subject updateSubject(String subjectId,
                                 Subject subject) {
        Subject subjectToUpdate = repository.findById(subjectId).get();

        subject.setName(subject.getName());
        subject.setCourse(subject.getCourse());
        return repository.save(subjectToUpdate);
    }

    public void deleteSubject(String subjectId) {
        repository.deleteById(subjectId);
    }
}
