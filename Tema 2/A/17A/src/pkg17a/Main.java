/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17a;

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
        
        double mm, cm, m, totalM, totalMm;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Medida en milímetros: ");
        mm = sc.nextDouble();
        System.out.print("Medida en centímetros: ");
        cm = sc.nextDouble();
        System.out.print("Medida en metros: ");
        m = sc.nextDouble();
        
        totalM = m*100;
        totalMm = mm/10;
        cm = cm + totalMm + totalM;
        System.out.println("Centímetros totales: " + cm);
    }
    
}
