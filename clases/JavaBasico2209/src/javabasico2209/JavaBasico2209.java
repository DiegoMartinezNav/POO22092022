/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author diegomartineznava
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = 22;
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(",-,-,-,-,-");
        // convetir Strings a entero
        String cadena= "99";
        int altura = Integer.parseInt(cadena);
        Color c1 = Color.BLUE;
       
        altura +=1;
        System.out.println("Altura = " + altura);
        
        float y= Float.parseFloat(cadena);
        y=y + 0.5f;
        System.out.println("Altura = " + y );
        System.out.println("-----------------------------");
        
        //JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        //System.out.println( dato );

        int edad3 = 15;
        // validar si es mayor de edad
        String resultado ="";
        if(edad3 < 18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        // lo mismo pero con ternario
        
        int edad4 = 24;
        String res = "";
        res = edad4 < 18? "Menor de edad edad 4": "Mayor de edad, tequila";
        System.out.println( res );
        
        // version minima
        int edad5=19;
        System.out.println( edad5 < 18? "Menor de edad 5":"Ya! El tequila");
        
        int val1=1;
        int val2=2;
        // comparacion a nivel de bits
        /*
        val 1=000...001;
        val 2=000...010;
         */
        System.out.println( val1 & val2 );
        
        int val3=1;
        int val4=0;
        val4 = val3 <<1;
        //numero de desplazaminetos a la izq.
        System.out.println( val4 ); //tiene que dar 2
        
        System.out.println("--------ARREGLOS----------");
        int[] edades;//primero se declara que sera un arreglo
        // en este punto aun no se reserva memoria
        // el segundo paso es reservarlo
        edades = new int[5];
        System.out.println( edades );
        edades[0] = 10;
        System.out.println("La primera edad es: " + edades[0]);
        
        // declarar e inicializar en una sola linea
        
        int [] estaturas = new int[5];
        
        int [] pesos = {86,99,56,76,77}; //en kilos
        System.out.println( pesos[0] ); //86
        System.out.println( pesos[1] );
        System.out.println( pesos[2] );
        System.out.println( pesos[3] );
        System.out.println( pesos[4] );
        
        System.out.println("--------CON FOR----------");
        for (int i = 0; i < pesos.length; i++) {
        System.out.println( pesos[i] );
    }
        System.out.println("Arreglo de alumnos");
        Alumno[] lista = new Alumno[5]; //5 alumnos
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[1] = new Alumno("77777", 2, 7.0f);
        lista[2] = new Alumno("55555", 2, 7.0f);
        lista[3] = new Alumno("88888", 2, 8.0f);
        lista[4] = new Alumno("86666", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println( alumno.evaluarDesempenio() );
            
        }
        
        /* For each es un FOR especial, introducido
        en la version 2 de JAVA, esa version fue la que 
        sufrio cambios muy grandes java
        El FOR EACH fue introducido para simplificar los
        FOR con arreglos.
        fore + TAB
        */
        System.out.println("Con for each...");
        for (Alumno alumno : lista) {
            System.out.println( alumno.evaluarDesempenio());
        }
        
        
        ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
        grupo2209.add( new Alumno("9999", 2, 9.0f));
        grupo2209.add( new Alumno("8888", 2, 8.0f));
        grupo2209.add( new Alumno("7777", 2, 7.0f));
        grupo2209.add( new Alumno("6666", 2, 6.0f));
        grupo2209.add( new Alumno("5555", 2, 5.0f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
        System.out.println("Add con indice");
        grupo2209.add( 2 , new Alumno("8111", 2, 9.9f));
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
        Alumno tmp = grupo2209.get(3);
        System.out.println( "Alumno en index = 1: " + tmp );
        
        System.out.println("Eliminar el index 3");
        Alumno tmp2 = grupo2209.remove( 3 );
        System.out.println("Elemento sacado = " + tmp2);
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
        System.out.println("Reemplazar el i-esimo elemento");
        grupo2209.set(0, new Alumno("4444", 2, 4.0f));
        System.out.println("El sacado es = " + tmp2);
        
        for (Alumno alumno : grupo2209) {
            System.out.println( alumno );
        }
        
    }
}
