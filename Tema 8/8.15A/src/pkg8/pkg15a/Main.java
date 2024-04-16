/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg15a;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Lista l1 = new Lista();
         Lista l2 = new Lista();
         
         l1.insertarFinal(1);
         l1.insertarFinal(2);
         l1.insertarFinal(3);
         l1.insertarFinal(4);
         
         l2.insertarFinal(1);
         l2.insertarFinal(2);
         l2.insertarFinal(3);
    
         System.out.println("Lista 1: " + l1.toString());
         System.out.println("Lista 2: " + l2.toString());
         
         System.out.println(l1.equals(l2));
    }
    
}
