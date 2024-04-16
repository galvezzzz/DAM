/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg5;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado, n1, n2, operaciones=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            n1 = (int)(Math.random()*99+1);
            n2 = (int)(Math.random()*99+1);
            
            System.out.print(n1 + " + " + n2 + " = ");
            resultado = sc.nextInt();
            
            operaciones++;
        }while(resultado == n1 + n2);
        
        operaciones = operaciones - 1;
        System.out.println("El usuario ha realizado bien " + operaciones + " operaciones");
    }
}
