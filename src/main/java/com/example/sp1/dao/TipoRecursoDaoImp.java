package com.example.sp1.dao;

import com.example.sp1.model.TipoRecurso;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipoRecursoDaoImp implements TipoRecursoDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<TipoRecurso> getAll_TipoRecurso() {
        return null;
    }

    @Override
    public TipoRecurso findById(int id) {
        return null;
    }

    @Override
    public TipoRecurso add_TipoRecurso(TipoRecurso newTipoRecurso) {
        return null;
    }

    @Override
    public TipoRecurso update_TipoRecurso(int id, TipoRecurso newTipoRecurso) {
        return null;
    }

    @Override
    public boolean delete_TipoRecurso(int id) {
        return false;
    }
}
