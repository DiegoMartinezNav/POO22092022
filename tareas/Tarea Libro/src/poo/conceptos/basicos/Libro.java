/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.conceptos.basicos;

import java.awt.Color;

/**
 *
 * @author diegomartineznava
 */
public class Libro {
    private String titulo;
    private String autor;
    private String edicion;
    private int paginas;
    private Color color;

    public Libro() {
    }

    public Libro(String titulo, String autor, String edicion, int paginas, Color color) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.paginas = paginas;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void leyendo(String accion ){
        System.out.println( this.titulo + " Diego lo esta " + accion );
    }
    
    public void abriendo(String accion ){
        System.out.println( "la maestra esta " + accion + " " + this.titulo );
    }
}
