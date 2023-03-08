package org.bedu.java.backend.PostWork4.model;

public class Persona {
    private String telefono;
    private String nombre;

    //Constructores
    public Persona(){}
    public Persona(String telefono, String nombre) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    // getter y setter
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return  "Persona{"+ "nombre='" + nombre + '\'' +
                ", telefono= '" + telefono +'\''+
                '}';}
}
