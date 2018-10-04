package com.example.sp1.dao;

import com.example.sp1.model.Matricula;

import java.util.List;

public interface MatriculaDao {

    List<Matricula> getAll_Matricula();

    Matricula findById(int id);

    Matricula add_Matricula(Matricula newMatricula);

    Matricula update_Matricula(int id, Matricula newMatricula);

    boolean delete_Matricula(int id);
}
