package com.spring.app.dto;

public class UsuarioDTO {
    private Long id;
    private String email;
    private String nombre;
    private String rolNombre;

    public UsuarioDTO(Long id, String email, String nombre, String rolNombre) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.rolNombre = rolNombre;
    }

    // Getters
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getNombre() { return nombre; }
    public String getRolNombre() { return rolNombre; }
}

