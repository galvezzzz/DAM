/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12a;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int entero, multiplo,suma;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        entero = sc.nextInt();
        
        //Al número entero le sacamos su resto dividiéndolo entre 7.
        multiplo = entero%7;
        //Si le restamos a 7 el múltiplo sabremos cuanto habrá que sumarle.
        suma = 7 - multiplo;
        
        System.out.println("Habrá que sumar: " + suma);
        
        
        
        
    }
    
}
