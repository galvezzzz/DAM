/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg1p;

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
        
        int edad, eM, em;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la edad del alumno: ");
        edad = sc.nextInt();
        
        eM = edad;
        em = edad;
        
        while(edad != -1){
            if (edad>eM) eM = edad;
            if (edad<em) em = edad;
            
            System.out.print("Introduce la edad: ");
            edad = sc.nextInt();
        }
        System.out.println("El mayor tendrá :" + eM);
        System.out.println("El menor tendrá :" + em);
    }
    
}
