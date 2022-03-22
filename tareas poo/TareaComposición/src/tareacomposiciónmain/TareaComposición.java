/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposiciónmain;

import Clases.Libro;
import Clases.Pelicula;
import Componentes.Libro.Autor;
import Componentes.Libro.Editorial;
import Componentes.Pelicula.Actor;
import Componentes.Pelicula.Director;
import Componentes.Pelicula.Productora;

/**
 *
 * @author diegomartineznava
 */
public class TareaComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola soy Diego");
        
        Libro libro1 = new Libro();
        libro1.setNombre("Los juegos del hambre");
        libro1.setAutor(new Autor("Suzanne Collins", 59));
        libro1.setEditorial(new Editorial("Scholastic Corporation", 1));
        System.out.println( libro1 );
        libro1.rentar();
        
        Pelicula peli1=new Pelicula();
        peli1.setTitulo("Coraline y la pueta secreta");
        peli1.setFechaDeEstreno("6 de Febrero del 2009");
        peli1.setDuración("1hr con 40min");
        peli1.setDirector(new Director("Henry Selick", 69, "30 de Noviembre de 1952"));
        peli1.setProductora(new Productora("Laika", "Travis Knight", "Hillsboro, Oregón, Estados Unidos"));
        peli1.setActorPrincipal(new Actor("Coraline", "Jones", 11));
        System.out.println( peli1 );
        peli1.reproducir();
    }
    
}
