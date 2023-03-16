package org.bedu.java.backend.e1.controller;

import org.bedu.java.backend.e1.model.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    @PostMapping
    public String creaUsuario(@RequestBody Usuario usuario){
        System.out.println("CreaUsuario");
        System.out.println("nombre: "+ usuario.getNombre());
        System.out.println("Apellido: "+ usuario.getApellido() );
        System.out.println("Correo: "+ usuario.getCorreoElectronico() );
        System.out.println("Passsword: "+ usuario.getPassword() );
        return "Usuario Creado";

    }
@PostMapping("/{id}")
    public String crearUsuarioParams(@RequestBody Usuario usuario, @PathVariable("id")long id){
    System.out.println("CreaUsuarioParams");
    System.out.println("nombre: "+ usuario.getNombre());
    System.out.println("Apellido: "+ usuario.getApellido() );
    System.out.println("Correo: "+ usuario.getCorreoElectronico() );
    System.out.println("Passsword: "+ usuario.getPassword() );
    return "Usuario " + id+ "creado";

}
    @PostMapping("/reto1")
    public String crearUsuarioParams(@RequestBody Usuario usuario,
                                     @RequestParam("id")long id,
                                     @RequestParam("rol") String rol) {
        System.out.println("CreaUsuarioReto1");
        System.out.println("nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Passsword: " + usuario.getPassword());
        System.out.println("Rol : " + rol);
        return "Usuario " + id + " creado con el rol " +rol;

    }


}
