/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg16a;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Pila p = new Pila();
        
        p.apilar(2);
        p.apilar(4);
        p.apilar(6);
        p.apilar(8);
        p.desapilar(2);
        p.mostrar();
    }
    
}
