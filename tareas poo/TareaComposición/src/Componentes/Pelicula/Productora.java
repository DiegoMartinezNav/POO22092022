/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes.Pelicula;

/**
 *
 * @author diegomartineznava
 */
public class Productora {
    private String nombre;
    private String presidente;
    private String lugarDeOrigen;

    public Productora() {
    }

    public Productora(String nombre, String presidente, String lugarDeOrigen) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.lugarDeOrigen = lugarDeOrigen;
    }

    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", presidente=" + presidente + ", lugarDeOrigen=" + lugarDeOrigen + '}';
    }
    
}
