/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg4;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Piano p = new Piano();
        
        p.add(Instrumento.octava.A);
        p.add(Instrumento.octava.B);
        p.add(Instrumento.octava.C);
        p.add(Instrumento.octava.E);
        
        p.Interpretar();
        

        
        
        
    }
    
}
