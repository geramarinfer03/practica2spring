package com.example.sp1.dao;

import com.example.sp1.model.Entrega;

import java.util.List;

public interface EntregaDao {

    List<Entrega> getAll_Entrega();

    Entrega findById(int id);

    Entrega add_Entrega(Entrega newEntrega);

    Entrega update_Entrega(int id, Entrega newEntrega);

    boolean delete_Entrega(int id);
}
