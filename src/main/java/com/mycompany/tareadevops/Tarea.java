/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareadevops;

/**
 *
 * @author daw2
 */
public class Tarea {
    
private String nombre;
private String descripcion;
private String autor;
public boolean completada;

public Tarea(){

}



public Tarea(String nombre,String autor,String descipcion){
this.nombre=nombre;
this.autor=autor;
this.descripcion=descripcion;
this.completada=false;

}
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public boolean isCompletada(){
        return completada;
    }

public void setCompletada(boolean completada){
    this.completada=completada;
}


public String showTarea(){

return "Tarea{"+"nombre: "+nombre+", descripcion: "+descripcion+", autor: "+autor+"}";
}

}

