package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
