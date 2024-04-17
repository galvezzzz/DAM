/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg8;

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
        double media, suma=0, n;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un número: ");
            n = sc.nextDouble();
            suma = suma + n;
        }
        media = suma / 10;
        System.out.println("La media de los 10 números será: " + media);
    }
}
