/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22a;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double lon;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca longitud: ");
        double decimal = sc.nextDouble();
        
        lon = decimal*100;
        long resultado = Math.round(lon);
        System.out.println("Longitud en centímetros: " + resultado);
        
    }
    
}
