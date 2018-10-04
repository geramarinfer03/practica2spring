package com.example.sp1.dao;

import com.example.sp1.model.Usuario;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsuarioDao {


    List<Usuario> getAll_Usuario();

    Usuario findById(int id);

    Usuario add_Usuario(Usuario newUsuario);

    Usuario findByEmail(String email) throws Exception;

    boolean update_Usuario(int id, Usuario newUsuario);

    boolean delete_Usuario(int id);
}
