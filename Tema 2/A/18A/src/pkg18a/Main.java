/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18a;

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
        
        int hormigas, arañas, cochinillas, patas;
        final int pHormigas=6, pArañas=8, pCochinillas=14;
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Hormigas capturadas: ");
        hormigas = sc.nextInt();
        
        System.out.print("Arañas capturadas: ");
        arañas = sc.nextInt();
        
        System.out.print("Cochinillas capturadas: ");
        cochinillas = sc.nextInt();
       
        hormigas = hormigas * pHormigas;
        arañas = arañas * pArañas;
        cochinillas = cochinillas * pCochinillas;
       
        patas = hormigas +arañas + cochinillas;
        System.out.println("Número total de patas: " + patas);
    }
    
}
