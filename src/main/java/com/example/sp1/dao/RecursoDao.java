package com.example.sp1.dao;

import com.example.sp1.model.Recurso;

import java.util.List;

public interface RecursoDao {

    List<Recurso> getAll_Recurso();

        Recurso findById(int id);

        Recurso add_Recurso(Recurso newRecurso);

        Recurso update_Recurso(int id, Recurso newRecurso);

        boolean delete_Recurso(int id);
}
