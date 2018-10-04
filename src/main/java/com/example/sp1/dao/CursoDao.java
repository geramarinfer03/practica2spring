package com.example.sp1.dao;


import com.example.sp1.model.Curso;

import java.util.List;

public interface CursoDao {
    
    List<Curso> getAll_Curso();

    Curso findById(int id);

    Curso add_Curso(Curso newCurso);

    Curso update_Curso(int id, Curso newCurso);

    boolean delete_Curso(int id);

}
