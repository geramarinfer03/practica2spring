package com.example.sp1.dao;

import com.example.sp1.model.Rol;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RolDaoImp implements RolDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Rol> getAll_rol() {
        return null;
    }

    @Override
    public Rol findById(int id) {
        return null;
    }

    @Override
    public Rol add_rol(Rol newrol) {
        return null;
    }

    @Override
    public Rol update_rol(int id, Rol newrol) {
        return null;
    }

    @Override
    public boolean delete_rol(int id) {
        return false;
    }
}

