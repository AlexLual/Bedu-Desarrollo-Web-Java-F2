package org.bedu.java.backend.r2.controllers;

import org.bedu.java.backend.r2.model.Saludo;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @PutMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo){

        saludo.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));

        return saludo;
    }

    @DeleteMapping("/saludo/{id}")
    public String saludaDel(@PathVariable int id){
        return  id + "Eliminado";
    }


}
