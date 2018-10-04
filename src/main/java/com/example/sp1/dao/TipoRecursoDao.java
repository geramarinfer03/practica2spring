package com.example.sp1.dao;

import com.example.sp1.model.TipoRecurso;

import java.util.List;

public interface TipoRecursoDao {

    List<TipoRecurso> getAll_TipoRecurso();

    TipoRecurso findById(int id);

    TipoRecurso add_TipoRecurso(TipoRecurso newTipoRecurso);

    TipoRecurso update_TipoRecurso(int id, TipoRecurso newTipoRecurso);

    boolean delete_TipoRecurso(int id);
}
