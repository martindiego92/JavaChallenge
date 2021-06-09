package com.AkemyChallenge.University.InterfaceServices;

import com.AkemyChallenge.University.Models.Professor;

import java.util.List;


public interface IProfessorServices {
    public List<Professor> list();
    Professor listID(int id);
    public int save(Professor p);
    public void delete(int id);
}
