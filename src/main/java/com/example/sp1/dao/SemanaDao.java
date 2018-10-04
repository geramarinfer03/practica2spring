package com.example.sp1.dao;

import com.example.sp1.model.Semana;

import java.util.List;

public interface SemanaDao {

    List<Semana> getAll_Semana();

    Semana findById(int id);

    Semana add_Semana(Semana newSemana);

    Semana update_Semana(int id, Semana newSemana);

    boolean delete_Semana(int id);
}
