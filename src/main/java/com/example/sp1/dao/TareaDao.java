package com.example.sp1.dao;

import com.example.sp1.model.Tarea;

import java.util.List;

public interface TareaDao {


    List<Tarea> getAll_Tarea();

    Tarea findById(int id);

    Tarea add_Tarea(Tarea newTarea);

    Tarea update_Tarea(int id, Tarea newTarea);

    boolean delete_Tarea(int id);
}
