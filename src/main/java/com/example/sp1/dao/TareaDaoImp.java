package com.example.sp1.dao;


import com.example.sp1.model.Tarea;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TareaDaoImp implements TareaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Tarea> getAll_Tarea() {
        return null;
    }

    @Override
    public Tarea findById(int id) {
        return null;
    }

    @Override
    public Tarea add_Tarea(Tarea newTarea) {
        return null;
    }

    @Override
    public Tarea update_Tarea(int id, Tarea newTarea) {
        return null;
    }

    @Override
    public boolean delete_Tarea(int id) {
        return false;
    }
}
