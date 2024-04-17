/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20a;

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
        
        double num, raiz;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        num = sc.nextDouble();
        
        raiz = Math.sqrt(num);
        
        System.out.println("La raíz cuadrada es " + raiz); 
    }
    
}
