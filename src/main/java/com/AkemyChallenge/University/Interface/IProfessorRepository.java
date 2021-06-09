package com.AkemyChallenge.University.Interface;

import com.AkemyChallenge.University.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfessorRepository extends JpaRepository<Professor, Integer> {
}
