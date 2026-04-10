package com.spring.app.dto;

public class ClienteDTO {
    private Long id;
    private String empresa;
    private String nombre;
    private String telefono;
    private String correo;

    public ClienteDTO(Long id, String empresa, String nombre, String telefono, String correo) {
        this.id = id;
        this.empresa = empresa;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters
    public Long getId() { return id; }
    public String getEmpresa() { return empresa; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
}
