/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double euro, peseta;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Cantidad de pesetas a convertir en euros: ");
        peseta = sc.nextDouble();
        
        euro = peseta / 166.386;
        
        System.out.println("El total de euros son: " + euro);
    }
    
}
