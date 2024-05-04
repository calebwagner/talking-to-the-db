package com.postgresql.sqldemo.controller;

import com.postgresql.sqldemo.model.Course;
import com.postgresql.sqldemo.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    private CourseRepo courseRepo;

    @PostMapping("/addCourse")
    public void addPerson(@RequestBody Course course) {
        courseRepo.save(course);
    }
}
