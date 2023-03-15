package org.bedu.java.backend.e3.service;

import jakarta.annotation.PostConstruct;
import org.bedu.java.backend.e3.model.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    private final Saludo saludo;

    @Autowired
    public SaludoService(Saludo saludo) {
        this.saludo = saludo;
    }


    @PostConstruct
    public void init(){
        saludo.setNombre("Alex");
    }

    public String saluda(){
        return "Hola " + saludo.getNombre();
    }
}
