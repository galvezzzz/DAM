/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg8;

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
        int num;
        char caracter;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        num = sc.nextInt();
        System.out.print("Ingrese el caracter con el que desea que se realice la piramide: ");
        sc.nextLine();
        caracter = sc.nextLine().charAt(0);
        
        for (int i = 1; i <= num; i++) {//bucle que controla las filas
            for (int j = 1; j <= num - i; j++) {//imprime los espacios que estan antes de cada caracter
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {//imprime los caracteres o espacios
                
                if (i > 2 && i < num) {
                    if (k == 1 || k == i) {
                        System.out.print(caracter + " ");
                    } else {
                        
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(caracter + " ");
                }
            }
            System.out.println("");
        }
    }

}
