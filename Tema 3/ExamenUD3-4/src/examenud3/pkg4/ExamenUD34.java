/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int cont = 3;
        int altura, valor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        //Condición de la altura
        if (altura < 1 || altura > 10) {
            System.out.println("La altura introducida no está en el rango.");
        } else {
            //Bucle externo que calcula el salto de línea
            for (int filas = 1; filas <= altura; filas++) {
                System.out.println("");

                //Bucles internos encargados de imprimir los dígitos y espacios
                for (int spc = 1; spc <= altura - filas; spc++) {
                    System.out.print(" ");
                }
                for (int izq = 1; izq <= filas; izq++) {
                    valor = (cont + filas - izq) % 10;
                    System.out.print(valor);
                }
                for (int izq = 1; izq < filas; izq++) {
                    valor = (cont + izq) % 10;
                    System.out.print(valor);
                }
            }
            System.out.println("");
        }
    }

}
