/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nota primer trimestre: ");
        nota1 = sc.nextDouble();
        System.out.print("Nota segundo trimestre: ");
        nota2 = sc.nextDouble();
        System.out.println("Nota media: " + (nota1 + nota2)/2.0);
        
        
        
    }
    
}
