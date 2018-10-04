package com.example.sp1.dao;

import com.example.sp1.model.Formulario;

import java.util.List;

public interface FormularioDao {

    List<Formulario> getAll_Formulario();

    Formulario findById(int id);

    Formulario add_Formulario(Formulario newFormulario);

    Formulario update_Formulario(int id, Formulario newFormulario);

    boolean delete_Formulario(int id);
}
