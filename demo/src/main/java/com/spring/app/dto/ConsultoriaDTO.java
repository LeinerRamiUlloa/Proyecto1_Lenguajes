package com.spring.app.dto;

public class ConsultoriaDTO {
    private Long id;
    private String tipo;
    private String estado;
    private String descripcion;

    public ConsultoriaDTO(Long id, String tipo, String estado, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public Long getId() { return id; }
    public String getTipo() { return tipo; }
    public String getEstado() { return estado; }
    public String getDescripcion() { return descripcion; }
}
