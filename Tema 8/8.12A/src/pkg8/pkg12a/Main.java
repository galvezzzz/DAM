/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg12a;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Caja c = new Caja(200, 200, 200, Unidad.cm);
        
        c.setEtiqueta("Correos");
        System.out.println("Volumen: " + c.getVolumen());
        System.out.println(c);
    }
    
}
