/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Componentes.Pelicula.Actor;
import Componentes.Pelicula.Director;
import Componentes.Pelicula.Productora;

/**
 *
 * @author diegomartineznava
 */
public class Pelicula {
    private String titulo;
    private String fechaDeEstreno;
    private String duración;
    private Director director;
    private Productora productora;
    private Actor actorPrincipal;

    public Pelicula() {
    }

    public Pelicula(String titulo, String fechaDeEstreno, String duración, Director director, Productora productora, Actor actorPrincipal) {
        this.titulo = titulo;
        this.fechaDeEstreno = fechaDeEstreno;
        this.duración = duración;
        this.director = director;
        this.productora = productora;
        this.actorPrincipal = actorPrincipal;
    }

    public Actor getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(Actor actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public void setFechaDeEstreno(String fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", fechaDeEstreno=" + fechaDeEstreno + ", duraci\u00f3n=" + duración + ", director=" + director + ", productora=" + productora + ", actorPrincipal=" + actorPrincipal + '}';
    }
    public void reproducir(){
        System.out.println( this.titulo + " la esta reproduciendo Diego");
    }
}
