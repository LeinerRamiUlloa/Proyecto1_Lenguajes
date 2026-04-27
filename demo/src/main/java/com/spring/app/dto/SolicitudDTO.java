package com.spring.app.dto;

public class SolicitudDTO {
    private Long id;
    private String nombreSolicitante;
    private String correoSolicitante;
    private String tipoServicio;
    private String descripcion;
    private String estado;
    private String fecha;
    private Long consultoriaId;
    private Long usuarioId;

    public SolicitudDTO(Long id, String nombreSolicitante, String correoSolicitante, String tipoServicio,
            String descripcion, String estado, String fecha, Long consultoriaId, Long usuarioId) {
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.correoSolicitante = correoSolicitante;
        this.tipoServicio = tipoServicio;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
        this.consultoriaId = consultoriaId;
        this.usuarioId = usuarioId;
    }

    // Getters
    public Long getId() { return id; }
    public String getNombreSolicitante() { return nombreSolicitante; }
    public String getCorreoSolicitante() { return correoSolicitante; }
    public String getTipoServicio() { return tipoServicio; }
    public String getDescripcion() { return descripcion; }
    public String getEstado() { return estado; }
    public String getFecha() { return fecha; }
    public Long getConsultoriaId() { return consultoriaId; }
    public Long getUsuarioId() { return usuarioId; }
}

