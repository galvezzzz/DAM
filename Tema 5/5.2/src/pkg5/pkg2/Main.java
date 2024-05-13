/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg2;

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
        
        int num[] = new int [5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduce un número: ");
            num[i] = sc.nextInt();
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        
        System.out.println("");
        
        System.out.println(Arrays.toString(num));
        
        System.out.println("");
        
        for (int valor : num) {
            System.out.println(valor);
        }
        
        
    }
    
}
