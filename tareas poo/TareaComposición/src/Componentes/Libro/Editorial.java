/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes.Libro;

/**
 *
 * @author diegomartineznava
 */
public class Editorial {
    private String nombre;
    private int edicion;

    public Editorial() {
    }

    public Editorial(String nombre, int edicion) {
        this.nombre = nombre;
        this.edicion = edicion;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", edicion=" + edicion + '}';
    }
        
}
