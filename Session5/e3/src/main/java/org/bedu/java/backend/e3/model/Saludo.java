package org.bedu.java.backend.e3.model;

import org.springframework.stereotype.Component;

@Component
public class Saludo {
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}