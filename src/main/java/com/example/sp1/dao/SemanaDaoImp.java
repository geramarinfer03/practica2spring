package com.example.sp1.dao;

import com.example.sp1.model.Semana;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SemanaDaoImp implements SemanaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Semana> getAll_Semana() {
        return null;
    }

    @Override
    public Semana findById(int id) {
        return null;
    }

    @Override
    public Semana add_Semana(Semana newSemana) {
        return null;
    }

    @Override
    public Semana update_Semana(int id, Semana newSemana) {
        return null;
    }

    @Override
    public boolean delete_Semana(int id) {
        return false;
    }
}
