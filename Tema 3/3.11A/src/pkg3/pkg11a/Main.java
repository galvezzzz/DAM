/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg11a;

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
        
        int n, resto;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        while(n>0){
            resto = n%2;
            System.out.print(resto);
            n /= 2;
        }
        System.out.println("");
    }
    
}
