package com.AkemyChallenge.University.InterfaceServices;

import com.AkemyChallenge.University.Models.Course;

import java.util.List;
import java.util.Optional;

public interface ICourseServices {

    public List<Course> list();
    Course getCourse(int id);
    public int save(Course c);
    public void delete(int id);
}
