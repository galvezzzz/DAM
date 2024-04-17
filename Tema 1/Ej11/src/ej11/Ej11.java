/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final double precioManzanas = 2.35;
        final double precioPeras = 1.95;
        int pManz1sem, pManz2sem;
        int pPera1sem, pPera2sem;
        double impTotal;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del primer semestre: ");
        pManz1sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        pManz2sem = sc.nextInt();
        
        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer semestre: ");
        pPera1sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        pPera2sem = sc.nextInt();
        
        impTotal = (pManz1sem + pManz2sem) * precioManzanas;
        impTotal += (pPera1sem + pPera2sem) * precioPeras;
        System.out.println("Importe total: " + impTotal + " euros");
    }
    
}
