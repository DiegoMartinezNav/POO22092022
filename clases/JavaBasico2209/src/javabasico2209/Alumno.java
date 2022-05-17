/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author diegomartineznava
 */
public class Alumno {
    private String numeroDeCuenta;
    private int semestre;
    private float promedio;

    public Alumno() {
    }

    public Alumno(String numeroDeCuenta, int semestre, float promedio) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroDeCuenta=" + numeroDeCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    public void estudiar (int minutos){
        System.out.println("Estudiando ..." + minutos + " minutos "); 
    }
    
    public String evaluarDesempenio(){
        return this.promedio > 8.0f? "Sobresaliente":"Regular";
    }
}
