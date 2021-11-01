package org.example.service;

import org.example.model.Course;
import org.example.repository.CourseRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {

    private CourseRepository repository;

    // constructor
    public CourseService(CourseRepository repo) {
        repository = repo;
    }

    @Override
    public List<Course> list() {
        return repository.findAll();
    }

    @Override
    public Course create(Course course) {
        //courses.add(course);
        return course;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
