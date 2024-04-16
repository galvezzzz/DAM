/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg2;

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
        
        int edad, suma=0, cont=0, mayor=0;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la edad: ");
        edad = sc.nextInt();
        
        while(edad >= 0){
            cont++;
            suma = suma + edad;
            if(edad>=18) mayor++;
            
            System.out.println("Introduce la edad: ");
            edad = sc.nextInt();
        }
            
            media = (double) suma / cont;

            System.out.println("Alumnos: " + cont);
            System.out.println("Media: " + media);
            System.out.println("Alumnos mayores de edad: " + mayor);
    }
}
