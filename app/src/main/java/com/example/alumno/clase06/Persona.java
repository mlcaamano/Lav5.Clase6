package com.example.alumno.clase06;

/**
 * Created by alumno on 27/04/2017.
 */

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
//
//    public void setNombre(String nombre){
//        this.nombre=nombre;
//    }
//
//    public void setApellido(String apellido)
//    {
//        this.apellido= apellido;
//    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

}
