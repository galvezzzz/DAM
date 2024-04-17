/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11a;

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
        
        final double IVA;
        double baseImponible;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Base imponible: ");
        baseImponible = sc.nextDouble();
       
        IVA = baseImponible*21/100;
        baseImponible = baseImponible + IVA;
        System.out.println("El importe correspondiente al IVA serán " + IVA + " euros.");
        System.out.println("El total serán " + baseImponible + " euros");
    }
    
}
