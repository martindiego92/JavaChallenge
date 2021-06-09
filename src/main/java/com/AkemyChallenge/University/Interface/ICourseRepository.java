package com.AkemyChallenge.University.Interface;

import com.AkemyChallenge.University.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course,Integer> {
}
