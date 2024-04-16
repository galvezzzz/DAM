/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg2p;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista l = new Lista();

        l.encolar(4);
        l.encolar(5);
        l.encolar(1);
            
        l.desencolarPrincipio();
        l.Mostrar();
    }
    
}
