package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.app.entity.Consultoria;

public interface ConsultoriaRepository extends JpaRepository<Consultoria, Long> {

    @Modifying
    @Query(value = "DELETE FROM consultorias WHERE id = :id", nativeQuery = true)
    int deleteConsultoriaById(@Param("id") Long id);
}
