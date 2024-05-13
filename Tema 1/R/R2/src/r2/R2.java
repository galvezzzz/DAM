/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double euro, peseta;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Cantidad de euros a convertir en pesetas: ");
        euro = sc.nextDouble();
        
        peseta = euro * 166.386;
        
        System.out.println("El total de pesetas son: " + peseta);
        
        
    }
    
}
