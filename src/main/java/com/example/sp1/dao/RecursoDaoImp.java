package com.example.sp1.dao;

import com.example.sp1.model.Recurso;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecursoDaoImp implements RecursoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Recurso> getAll_Recurso() {
        return null;
    }

    @Override
    public Recurso findById(int id) {
        return null;
    }

    @Override
    public Recurso add_Recurso(Recurso newRecurso) {
        return null;
    }

    @Override
    public Recurso update_Recurso(int id, Recurso newRecurso) {
        return null;
    }

    @Override
    public boolean delete_Recurso(int id) {
        return false;
    }
}
