package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Consultoria;

public interface ConsultoriaRepository extends JpaRepository<Consultoria, Long> {
    
}
