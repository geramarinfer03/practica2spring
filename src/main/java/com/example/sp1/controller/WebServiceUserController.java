package com.example.sp1.controller;

import com.example.sp1.model.Usuario;
import com.example.sp1.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class WebServiceUserController {

    @Autowired
    private UsuarioService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/users")
    public List<Usuario> getEmployees() throws Exception {
        List<Usuario> listUsers = userService.getAll_Usuario();
        return listUsers;
        //return listUsers.stream().map(user -> convertEmployeeToDto(user)).collect(Collectors.toList());
    }
}
