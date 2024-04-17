/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double n;
    int redondeo;
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    
    System.out.println("Escriba un numero decimal (con punto); ");
    n = sc.nextDouble();
    
    redondeo = (int) (n + 0.5);
    System.out.println(n + "redondeado es: " + redondeo);
    }
    
}
