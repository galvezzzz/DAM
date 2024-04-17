/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albertoexament5parte2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlbertoExamenT5Parte2 {

    static void mostrar(int tablero[][], int col) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print("| " + tablero[i][j] + " ");
            }
            System.out.print("|");

            System.out.println("");
        }

        for (int i = 0; i < col; i++) {
            System.out.print("----");
        }

        System.out.println("");

        for (int i = 1; i <= col; i++) {
            System.out.print("|C" + (i) + " ");
        }
        System.out.print("|");
        System.out.println("");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int col, aleatorio, colElegida, cont = 0, totalCasillas = 0,
                jugadas = 0, colIzq;
        boolean check = true;

        System.out.print("Introduce el numero de columnas (4/6): ");
        col = sc.nextInt();

        while (col < 4 || col > 6) {
            System.out.println("Error de columnas");
            System.out.print("Introduce el numero de columnas (4/6): ");
            col = sc.nextInt();
        }
        int tablero[][] = new int[5][col];

        totalCasillas = 5 * col;

        mostrar(tablero, col);

        //Desarrollo del juego
        while (jugadas < totalCasillas && check) {

            aleatorio = (int) (Math.random() * 9 + 1);

            System.out.print("Elija la columna donde quiera insertar el " + aleatorio + ": ");
            colElegida = sc.nextInt() - 1;

            cont = 0;

            //Introducimos el número
            for (int fila = 0; fila < tablero.length; fila++) {
                if (tablero[fila][colElegida] == 0 && cont == 0) {
                    tablero[fila][colElegida] = aleatorio;
                    cont++;
                }

                //Me falta comprobar si el número de la columna izquierda es mayor.
                colIzq = colElegida - 1;

                while (fila > -1) {
                    if (tablero[fila][colElegida] <= tablero[fila][colIzq] && tablero[fila][colIzq] != 0) {
                        check = false;
                        System.out.println("FINAL DEL JUEGO");
                    }
                }

            }

            jugadas++;
            mostrar(tablero, col);

        }

    }

}
