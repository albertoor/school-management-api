package com.aornelass.sm.service;

import com.aornelass.sm.models.Student;
import com.aornelass.sm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(String studentId) {
        return repository.findById(studentId).get();
    }

    public void deleteStudent(String studentId) {
        repository.deleteById(studentId);
    }

    public Student updateStudent(String studentId, Student student) {
        Student studentToUpdate =
            repository.findById(studentId).get();

        studentToUpdate.setFName(student.getFName());
        studentToUpdate.setLName(student.getLName());
        studentToUpdate.setCareer(student.getCareer());
        studentToUpdate.setGender(student.getGender());
        studentToUpdate.setEmail(student.getEmail());
        studentToUpdate.setPassword(student.getPassword());
        studentToUpdate.setPhone(student.getPhone());
        studentToUpdate.setDob(student.getDob());
        studentToUpdate.setStatus(student.isStatus());

        return repository.save(studentToUpdate);
    }
}
