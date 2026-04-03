package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
    
}
