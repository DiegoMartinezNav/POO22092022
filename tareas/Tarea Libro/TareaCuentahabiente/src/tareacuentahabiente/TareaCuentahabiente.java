/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author diegomartineznava
 */
public class TareaCuentahabiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arreglo clientes con for each");
        Cuentahabiente[] lista = new Cuentahabiente [5];
        lista[0] = new Cuentahabiente(1111, "Diego", 30000);
        lista[1] = new Cuentahabiente(2222, "Beatriz", 70000);
        lista[2] = new Cuentahabiente(3333, "Luis", 53500);
        lista[3] = new Cuentahabiente(4444, "Ximena", 15000);
        lista[4] = new Cuentahabiente(5555, "Alberto", 700);
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println( cuentahabiente.evaluarNivelCliente() );
        }
    }
    
}
