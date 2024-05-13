/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle14;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escribe un programa que pida una base y un exponente (entero positivo) y que
        calcule la potencia.*/
        
        double base, expo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la base: ");
        base = sc.nextDouble();
        
        System.out.print("Introduce el exponente: ");
        expo = sc.nextDouble();
        
        System.out.println("El número " + base + " con exponente " + expo + " tendrá como resultado: " + Math.pow(base, expo));
    }
    
}
