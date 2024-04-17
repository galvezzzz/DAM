/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramidenum;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PiramideNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int altura, cont;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura de la pirámide: ");
        altura = sc.nextInt();

        //Salto de línea
        for (int filas = 1; filas <= altura; filas++) {
            System.out.println("");
            cont = 0;
            //Espacios
            for (int spc = 1; spc <= altura - filas; spc++) {
                System.out.print(" ");
            }
            //Parte izquierda y medio
            for (int columnas = 1; columnas <= filas; columnas++) {
                cont++;
                System.out.print(cont%10);
            }
            //Parte derecha
            for (int i = 1; i < filas; i++) {
                cont--;
                System.out.print(cont%10);
            }
        }
        System.out.println("");
    }
}
