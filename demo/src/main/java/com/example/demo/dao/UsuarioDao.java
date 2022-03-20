package com.example.demo.dao;

import com.example.demo.models.Usuario;

import java.util.List;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(String id);

    void registrar(Usuario usuario);

    Usuario verificarEmailPassword(Usuario usuario);
}
