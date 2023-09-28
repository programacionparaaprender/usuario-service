package com.programacionparaaprender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacionparaaprender.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{


}
