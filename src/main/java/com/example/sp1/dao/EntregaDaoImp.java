package com.example.sp1.dao;

import com.example.sp1.model.Entrega;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntregaDaoImp implements EntregaDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Entrega> getAll_Entrega() {
        return null;
    }

    @Override
    public Entrega findById(int id) {
        return null;
    }

    @Override
    public Entrega add_Entrega(Entrega newEntrega) {
        return null;
    }

    @Override
    public Entrega update_Entrega(int id, Entrega newEntrega) {
        return null;
    }

    @Override
    public boolean delete_Entrega(int id) {
        return false;
    }
}
