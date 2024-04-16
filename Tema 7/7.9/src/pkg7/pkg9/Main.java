/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg9;
/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        bombilla b1 = new bombilla();
        bombilla b2 = new bombilla();
        bombilla b3 = new bombilla();
        
        bombilla.general = true;
        
        b1.encender();
        b1.estado();
        
        b2.estado();
        
        b3.apagar();
        b3.estado();
        
        
        
    }
    
}
