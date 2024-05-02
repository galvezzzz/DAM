/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg2;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        c.insertarFinal(2);
        c.insertarFinal(2);

        c.insertarPrincipio(8);
        c.insertarPrincipio(8);

        c.extraerFinal();
        c.extraerPrincipio();
        
        c.ordenar();
        
        System.out.println(c);
    }
    
}
