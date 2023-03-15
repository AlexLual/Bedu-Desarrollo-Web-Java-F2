package org.bedu.java.backend.e1.service;

import org.bedu.java.backend.e1.model.Saludo;
import org.bedu.java.backend.e1.model.SaludoComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    private final SaludoComponent saludoComponent;

    @Autowired
    public SaludoService(SaludoComponent saludoComponent) {
        this.saludoComponent = saludoComponent;
    }

    public String saluda(){
        return "Ejemplo 02: Hola " + saludoComponent.getNombre();
    }
}