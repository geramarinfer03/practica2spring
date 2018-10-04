package com.example.sp1.dao;

import com.example.sp1.model.Curso;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CursoDaoImp implements CursoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Curso> getAll_Curso() {
        return null;
    }

    @Override
    public Curso findById(int id) {
        return null;
    }

    @Override
    public Curso add_Curso(Curso newCurso) {
        return null;
    }

    @Override
    public Curso update_Curso(int id, Curso newCurso) {
        return null;
    }

    @Override
    public boolean delete_Curso(int id) {
        return false;
    }
}
