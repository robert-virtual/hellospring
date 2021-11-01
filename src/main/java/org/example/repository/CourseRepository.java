package org.example.repository;

import org.example.model.Course;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course>{

    private List<Course> courses;

    public CourseRepository() {
        courses = new ArrayList<>();
        Course springCourse = new Course(1,"springCourse","Lets learn spring");
        courses .add(springCourse);
    }

    @Override
    public List<Course> findAll() {

        return courses;
    }
}
