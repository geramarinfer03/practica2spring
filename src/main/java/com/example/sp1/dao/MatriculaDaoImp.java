package com.example.sp1.dao;

import com.example.sp1.model.Matricula;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MatriculaDaoImp implements MatriculaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Matricula> getAll_Matricula() {
        return null;
    }

    @Override
    public Matricula findById(int id) {
        return null;
    }

    @Override
    public Matricula add_Matricula(Matricula newMatricula) {
        return null;
    }

    @Override
    public Matricula update_Matricula(int id, Matricula newMatricula) {
        return null;
    }

    @Override
    public boolean delete_Matricula(int id) {
        return false;
    }
}
