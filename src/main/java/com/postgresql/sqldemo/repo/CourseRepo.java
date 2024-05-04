package com.postgresql.sqldemo.repo;

import com.postgresql.sqldemo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepo extends JpaRepository<Course, Long> {
}
