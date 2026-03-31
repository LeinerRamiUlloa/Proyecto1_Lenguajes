package com.spring.app.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "consultorias")
public class Consultoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;   // legal, ambiental, industrial
    private String estado; // pendiente, en proceso, finalizada

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "consultoria")
    private List<Solicitud> solicitudes;
}

