/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg3;

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
        
        System.out.print("Introduce el espacio del array: ");
        cant = sc.nextInt();
        
        num = new int [cant];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = sc.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
}
