/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Inicializo una matriz de dos filas y tres columnas
        int matriz[][] = new int[2][3];

        //Para hayar la longitud de las filas utilizo .length sobre la matriz
        for (int fila = 0; fila < matriz.length; fila++) {

            //Para longitud de columnas extraigo una fila de la matriz y...
            //utilizo .length sobre ese array
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print("Introduce un valor: ");
                matriz[fila][col] = sc.nextInt();
            }

        }
        //Imprimir matriz desde la clase arrays
        System.out.println(Arrays.deepToString(matriz));

        //Imprimo a mano (sin arrays)
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println("");
        }

        //Imprimo la matriz por filas con arrays
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println(Arrays.toString(matriz[fila]));
        }

        System.out.println("");

        //Imprimo la matriz con for-each y arrays
        for (int fila[] : matriz) {
            System.out.println(Arrays.toString(fila));

        }

        System.out.println("");
        
        //Imprimo la matriz entera con for-each
        System.out.println("Matriz con for-each");
        for (int fila[] : matriz) {
            for (int col : fila) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }

}
