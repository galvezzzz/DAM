/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.bidimensional;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExBidimensional {

    public static void mostrarReversi(int fil, int col, int contAzules, int contRojas) {

        int contPos = 1;

        int matriz[][] = new int[fil][col];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < col; columnas++) {
                System.out.print("|  ");
            }
            System.out.println("");
        }
        for (int i = 0; i < col; i++) {
            System.out.print("|C" + contPos);
            contPos++;
        }
        System.out.println("");
        System.out.println("Fichas rojas: " + contRojas);
        System.out.println("Fichas azules: " + contAzules);

    }

//    public static int insertarFichaEnColumna(int matriz[][], int pos) {
//
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int col, fil, contAzules = 0, contRojas = 0, cont = 0;

        System.out.print("Indique el número de filas: ");
        fil = sc.nextInt();

        while (fil < 4 || fil > 8) {
            System.out.print("Indique el número de filas: ");
            fil = sc.nextInt();
        }

        System.out.print("Indique el número de columnas: ");
        col = sc.nextInt();

        while (col < 4 || col > 8) {
            System.out.print("Indique el número de columnas: ");
            col = sc.nextInt();
        }

        mostrarReversi(fil, col, contAzules, contRojas);

        while (cont < col) {
            System.out.println("");

            System.out.print("Indica la columna donde quiere jugar la ficha AZUL: ");
            sc.nextInt();
            contAzules++;

            mostrarReversi(fil, col, contAzules, contRojas);

            System.out.print("Indica la columna donde quiere jugar la ficha ROJA: ");
            sc.nextInt();
            contRojas++;

            mostrarReversi(fil, col, contAzules, contRojas);

        }
    }

}
