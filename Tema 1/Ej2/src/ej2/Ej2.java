/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int n1;
       
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Edad del usuario: ");
        n1 = sc.nextInt();
       
        n1++;
        System.out.println("Edad del año que viene: " +n1++);
    }
    
}
