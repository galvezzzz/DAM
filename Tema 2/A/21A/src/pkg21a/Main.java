/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg21a;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a, b;
        boolean coincidencia;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el valor de a: ");
        a = sc.nextInt();
        
        System.out.print("Introduzca el valor de b: ");
        b = sc.nextInt();
        
        coincidencia = a==b;
        
        System.out.println("¿Poseen a y b el mismo valor? " + coincidencia);
        
       
    }
    
}
