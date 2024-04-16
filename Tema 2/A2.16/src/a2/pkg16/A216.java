/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        
        num = num < 0 ? -num : num;
        
        System.out.println("El valor absoluto será: " + num);
    }
    
}
