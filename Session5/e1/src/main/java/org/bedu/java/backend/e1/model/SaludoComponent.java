package org.bedu.java.backend.e1.model;

import org.springframework.stereotype.Component;

@Component
public class SaludoComponent {

    private final String nombre;

    public SaludoComponent (){
        this.nombre ="Alex";
    }

    public String getNombre(){
        return nombre;
    }
}
