/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Realiza un conversor de Kb a Mb.
        double mb, kb;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca un número para los Kb: ");
        kb = sc.nextDouble();
        
        mb = kb / 1000;
        System.out.println("El total de Mb serán: " + mb);
    }
    
}
