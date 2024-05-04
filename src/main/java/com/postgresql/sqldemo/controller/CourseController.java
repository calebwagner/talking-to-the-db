package com.postgresql.sqldemo.controller;

import com.postgresql.sqldemo.model.Course;
import com.postgresql.sqldemo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @GetMapping("/getCourse/{id}")
    public Course getCourse(@PathVariable Long id) {
        return courseRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id " + id));
    }

    @PostMapping("/addCourse")
    public void addPerson(@RequestBody Course course) {
        courseRepo.save(course);
    }

    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepo.deleteById(id);
    }

    @PutMapping("/updateCourse/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course updatedCourse) {
        Course course = courseRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id " + id));

        course.setTitle(updatedCourse.getTitle());
        course.setDuration(updatedCourse.getDuration());
        course.setContentUrl(updatedCourse.getContentUrl());
        course.setIsRetired(updatedCourse.getIsRetired());

        courseRepo.save(course);
    }
}
