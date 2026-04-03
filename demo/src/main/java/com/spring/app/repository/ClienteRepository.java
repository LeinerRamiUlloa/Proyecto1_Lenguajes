package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
