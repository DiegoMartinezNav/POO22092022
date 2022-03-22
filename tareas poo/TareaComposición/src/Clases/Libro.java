/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Componentes.Libro.Autor;
import Componentes.Libro.Editorial;

/**
 *
 * @author diegomartineznava
 */
public class Libro {
    private String nombre;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String nombre, Autor autor, Editorial editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void rentar(){
        System.out.println( this.nombre + " esta rentado");
    }
}
