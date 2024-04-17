/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud3.pkg1;

/**
 *
 * @author Usuario
 */
public class ExamenUD31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aleatorio;
        
        System.out.println("Generando la combinación de la lotería primitiva");
        //Con este bucle generamos 6 números
        for (int i = 1; i <= 6; i++) {
            /*Le indicamos que los números aleatorios tienen que ser mayores o 
            iguales a 1 y menores a 49*/
            aleatorio = (int) (Math.random() * 49 + 1);
            System.out.print(aleatorio + " ");
        }
        System.out.println("");
    }
    
}
