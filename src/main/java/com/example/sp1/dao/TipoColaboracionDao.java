package com.example.sp1.dao;

import com.example.sp1.model.TipoColaboracion;

import java.util.List;

public interface TipoColaboracionDao {

    List<TipoColaboracion> getAllColaborationType();

    TipoColaboracion findById(int id);

    TipoColaboracion addColaborationType(TipoColaboracion newcolaborationtype);

    TipoColaboracion updateColaborationType(int id, TipoColaboracion newcolaborationtype);

    boolean deleteColaborationType(int id);
}
