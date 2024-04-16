/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();        
        
        boolean par = (num % 2)==0;
        System.out.println("Es par: " + par);



    }
    
}
