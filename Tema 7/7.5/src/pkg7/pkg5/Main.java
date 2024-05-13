/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg5;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Gestor g;
        System.out.println("Cuenta 1");
        g = new Gestor("Luis", 77128394, 7000);
        g.mostrar();
        
        System.out.println("");
        
        g.setImporteMax(5000);
        g.setNombre("Luis Alberto");
        g.mostrar();
    }

}
