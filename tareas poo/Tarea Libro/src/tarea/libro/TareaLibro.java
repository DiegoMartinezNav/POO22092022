/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.libro;

import java.awt.Color;
import poo.conceptos.basicos.Libro;

/**
 *
 * @author diegomartineznava
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola, soy Diego Martinez Nava");
        
        Libro anillos=new Libro();
        anillos.setTitulo("El señor de los anillos");
        System.out.println("Titulo: " + anillos.getTitulo());
        
        anillos.setAutor("JRR Tolkien");
        System.out.println("Autor: " + anillos.getAutor() );
        
        anillos.setEdicion("1ra Edición");
        System.out.println("Edición: " + anillos.getEdicion() );
        
        anillos.setColor(Color.green);
        System.out.println("Color: " + anillos.getColor() );
        
        anillos.leyendo("leyendo");
        anillos.abriendo("abriendo");
    }
    
}
