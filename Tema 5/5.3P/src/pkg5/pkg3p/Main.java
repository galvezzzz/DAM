/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg3p;

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
        
        int cant, num[];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        cant = sc.nextInt();
        
        num = new int [cant];
        
        Arrays.fill(num, 4);
        
        for (int valor:num) {
            System.out.print(valor + " ");
        }
        
    }
    
}
