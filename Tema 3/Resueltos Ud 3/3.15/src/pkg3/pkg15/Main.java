/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg15;

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
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}
