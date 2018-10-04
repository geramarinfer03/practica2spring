package com.example.sp1.dao;

import com.example.sp1.model.Rol;

import java.util.List;

public interface RolDao {

    List<Rol> getAll_rol();

    Rol findById(int id);

    Rol add_rol(Rol newrol);

    Rol update_rol(int id, Rol newrol);

    boolean delete_rol(int id);
}
