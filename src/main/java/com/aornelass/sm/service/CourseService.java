package com.aornelass.sm.service;

import com.aornelass.sm.models.Course;
import com.aornelass.sm.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getCourses() {
        return repository.findAll();
    }

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public Course getCourse(String courseId) {
        return repository.findById(courseId).get();
    }

    public void deleteCourse(String courseId) {
        repository.deleteById(courseId);
    }

    public Course updateCourse(String courseId, Course course) {
        Course courseToUpdate = repository.findById(courseId).get();

        courseToUpdate.setCourseName(course.getCourseName());
        courseToUpdate.setDescription(course.getDescription());
        courseToUpdate.setSchoolYear(course.getSchoolYear());
        courseToUpdate.setSubjectList(course.getSubjectList());
        return repository.save(courseToUpdate);
    }
}
