/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.composicion;

/**
 *
 * @author diegomartineznava
 */
public class Pedal {
    private String marca;
    private String material;
    private int rodada;

    public Pedal() {
    }

    public Pedal(String marca, String material, int rodada) {
        this.marca = marca;
        this.material = material;
        this.rodada = rodada;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Pedal{" + "marca=" + marca + ", material=" + material + ", rodada=" + rodada + '}';
    }
    
    
}
