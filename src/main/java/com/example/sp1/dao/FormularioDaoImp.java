package com.example.sp1.dao;

import com.example.sp1.model.Formulario;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FormularioDaoImp implements FormularioDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Formulario> getAll_Formulario() {
        return null;
    }

    @Override
    public Formulario findById(int id) {
        return null;
    }

    @Override
    public Formulario add_Formulario(Formulario newFormulario) {
        return null;
    }

    @Override
    public Formulario update_Formulario(int id, Formulario newFormulario) {
        return null;
    }

    @Override
    public boolean delete_Formulario(int id) {
        return false;
    }
}
