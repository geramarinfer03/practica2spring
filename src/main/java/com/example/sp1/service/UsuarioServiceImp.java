package com.example.sp1.service;

import com.example.sp1.dao.UsuarioDao;
import com.example.sp1.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> getAll_Usuario() {
     return usuarioDao.getAll_Usuario();
    }

    @Override
    public Usuario findById(int id) {
        return null;
    }

    @Override
    public Usuario add_Usuario(Usuario newUsuario) {
        return null;
    }

    @Override
    public Usuario findByEmail(String email) {
        try {
            return usuarioDao.findByEmail(email);
        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    @Override
    public boolean update_Usuario(int id, Usuario newUsuario) {
        return false;
    }

    @Override
    public boolean delete_Usuario(int id) {
        return false;
    }
}
