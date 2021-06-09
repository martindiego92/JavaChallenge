package com.AkemyChallenge.University.Services;

import com.AkemyChallenge.University.Interface.IProfessorRepository;
import com.AkemyChallenge.University.InterfaceServices.IProfessorServices;
import com.AkemyChallenge.University.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService implements IProfessorServices {
    private IProfessorRepository repository;
    @Override
    public List<Professor> list() {
        return repository.findAll();
    }

    @Override
    public Professor listID(int id) {
        return null;
    }

    @Override
    public int save(Professor p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
