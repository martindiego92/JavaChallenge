package com.AkemyChallenge.University.Services;

import com.AkemyChallenge.University.Interface.ICourseRepository;
import com.AkemyChallenge.University.InterfaceServices.ICourseServices;
import com.AkemyChallenge.University.Models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService implements ICourseServices {

    @Autowired
    private ICourseRepository repository;

    @Override
    public List<Course> list() {
        return repository.findAll();
    }

    @Override
    public Course getCourse(int id) {
        return null;
    }

    @Override
    public int save(Course c) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
