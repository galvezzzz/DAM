/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radio;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radio: ");
        radio = sc.nextDouble();
        System.out.println("Longitud: " + 2 * Math.PI * radio);
        System.out.println("Área: " + Math.PI * radio * radio);
       
        
       
    }
    
    
}
