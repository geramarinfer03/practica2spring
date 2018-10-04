package com.example.sp1.dao;

import com.example.sp1.model.TipoColaboracion;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TipoColaboracionDaoImp implements TipoColaboracionDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<TipoColaboracion> getAllColaborationType() {
        return null;
    }

    @Override
    public TipoColaboracion findById(int id) {
        return null;
    }

    @Override
    public TipoColaboracion addColaborationType(TipoColaboracion newcolaborationtype) {
        return null;
    }

    @Override
    public TipoColaboracion updateColaborationType(int id, TipoColaboracion newcolaborationtype) {
        return null;
    }

    @Override
    public boolean deleteColaborationType(int id) {
        return false;
    }
}
