package com.aornelass.sm.controllers;

import com.aornelass.sm.models.Course;
import com.aornelass.sm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getCourses();
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return service.getCourse(courseId);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable String courseId) {
        service.deleteCourse(courseId);
    }

    @PutMapping("/{courseId}")
    public Course updateCourse(@PathVariable String courseId,
                               @RequestBody Course course){
        return service.updateCourse(courseId, course);
    }


}
