/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo3;

/**
 *
 * @author Usuario
 */
public class Refuerzo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal an = new Animal("Sexual", "Carnívoro", 1.2, 'M');
        Ave av = new Ave("Sexual", "Hervíboro", 0.5, 'H');
        Gato g = new Gato("Sexual", "Carnívoro", 0.5, 'H');
        Perro p = new Perro("Sexual", "Carnívoro", 0.5, 'M');
        Canario c = new Canario("Sexual", "Carnívoro", 0.5, 'M');
        
        av.hacerNido();
     
        
    }
    
}
