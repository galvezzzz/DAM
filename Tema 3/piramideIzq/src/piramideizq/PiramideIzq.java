/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramideizq;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PiramideIzq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int fila;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce filas: ");
        fila = sc.nextInt();
        
        for (int i = 1; i <= fila; i++) {
            for (int k = 1; k <=fila - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
