/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg16a;

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
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
