/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg19;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el ángulo en grados: ");
        double angle = sc.nextDouble();
        
        angle = angle % 360;
        
        double op = (angle * 2 * Math.PI)/360;
        
        System.out.println("El valor en radianes es: " + op);
    }
    
}
