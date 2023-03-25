package org.bedu.java.backend.E2.model;

import jakarta.validation.constraints.*;

public class Usuario {
    @NotBlank
    private String nombre;

    @Email
    private String email;

    @Min(8)
    @Max(20)
    private String username;

    @NotBlank
    private String rol;

    @NotBlank
    private String password;

    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$")
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



}