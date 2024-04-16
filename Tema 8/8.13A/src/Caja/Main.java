/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Caja;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CajaCarton cc = new CajaCarton(200,200,200);
        
        System.out.println("Volumen: " + cc.getVolumen());
        System.out.println("Superficie: " + cc.getSuperficie());
        System.out.println(cc.toString());
        
    }
    
}
