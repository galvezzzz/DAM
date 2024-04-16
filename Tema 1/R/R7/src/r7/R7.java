/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, total, suma;
        final double IVA = 21;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca la base imponible: ");
        base = sc.nextDouble();
        
        suma = (base*IVA)/100;
        total = base + suma;
        
        System.out.println("Total de la factura: " + total);
    }
    
}
