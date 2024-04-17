/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num;
        
        //Introducimos un escáner
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //Escaneamos el número introducido por el usuario
        System.out.print("Introduce un número real: ");
        num = sc.nextDouble();
        
        //Gracias al operador ternario averiguamos si el número es positivo o negativo
        System.out.println(num >= 0 ? "Positivo" : "Negativo");
    }
    
}
