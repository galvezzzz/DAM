/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double precioBruto, precioIva, precioTotal;
        final double IVA = 21;
        
        //Introducimos un escáner y ponemos los decimales con punto
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        //Escaneamos el precio introducido por el usuario
        System.out.print("Introduce el precio del producto: ");
        precioBruto = sc.nextDouble();
        
        //Sumamos el precio introducido por el usuario con su IVA correspondiente para dar lugar al total
        precioIva = (precioBruto * IVA) / 100;
        precioTotal = precioBruto + precioIva;
        
        //Gracias al printf obligamos a que la salida sea con solo dos decimales
        System.out.printf("El precio con IVA es: %.2f " , precioTotal);
    }
    
}
