/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle20;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int filas;
        char car;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();

        sc.nextLine();

        System.out.print("Introduce un caracter: ");
        car = sc.nextLine().charAt(0);

        //Bucle externo
        for (int i = 0; i < filas; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    // Imprimir asterisco en los extremos
                    System.out.print(car);
                } else {
                    // Imprimir espacio en blanco en el centro
                    System.out.print(" ");
                } 
            }

            // Cambiar de línea después de imprimir cada fila
            System.out.println();
        }
    }
}
