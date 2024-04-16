/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg19a;

import java.util.Arrays;
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
        
        int dorsales, cont = 0;
        int finalistas[] = new int[0];        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el dorsal del corredor que ha llegado: ");
        dorsales = sc.nextInt();
        
        while(dorsales != -1){
            
            finalistas = Arrays.copyOf(finalistas, finalistas.length + 1);
            finalistas[cont] = dorsales;
            
            
            System.out.print("Introduce el dorsal del corredor que ha llegado: ");
            dorsales = sc.nextInt();
            cont++;
        }
        
    }
    
}
