/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19a;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double eInfantil, eAdulta, pTotal, pTotal2;
        final double pInfantil=15.50, pAdulta=20;
        
        System.out.print("Número de entradas infantiles: ");
        eInfantil = sc.nextDouble();
        
        System.out.print("Número de entradas adultas: ");
        eAdulta = sc.nextDouble();
        
        eInfantil = eInfantil * pInfantil;
        eAdulta = eAdulta * pAdulta;
        pTotal = eInfantil + eAdulta;
        
        pTotal2 = pTotal >= 100 ? pTotal * 0.95 : pTotal; 
        
        System.out.println("Precio total: " + pTotal2);
        
        
               
    }
    
}
