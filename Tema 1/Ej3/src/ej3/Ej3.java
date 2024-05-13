/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aActual;
        int aNacimiento;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Año de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("Año actual: ");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento;
        
        System.out.println("Su edad será: " + edad);
    } 
    
}
