package com.example.sp1.service;

import com.example.sp1.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    List<Usuario> getAll_Usuario() throws Exception;

    Usuario findById(int id);

    Usuario add_Usuario(Usuario newUsuario);

    Usuario findByEmail(String email);

    boolean update_Usuario(int id, Usuario newUsuario);

    boolean delete_Usuario(int id);
}
