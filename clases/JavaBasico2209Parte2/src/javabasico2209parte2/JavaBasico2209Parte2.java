/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diegomartineznava
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Exepciones
        */
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println( nombres );
        }
        
        System.out.println("---------------");
        Scanner teclado = new Scanner( System.in );
        int seleccion = teclado.nextInt();
        
        String elNombre="";
        try {
            elNombre = nombres.get( seleccion );
        } catch (Exception e) {
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get( 0 );
        }finally{
            System.out.println( elNombre );
            elNombre = null;
        }
        //Limpieza
        
       // System.out.println( nombres.get( seleccion ));
        
        System.out.println("Continiuar el programa");
        System.out.println("Fin del programa");
    }
   
}
