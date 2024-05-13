/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg15a;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {

        int alumno, media1, media2, media3, suma = 0, mediaAlumno,pepe=1;
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[3][5];

        for (int fila = 0; fila < matriz.length; fila++) {

            System.out.println("Trimestre " + (fila + 1));

            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print("Introduce la nota del alumno " + (col + 1) + ": ");
                matriz[fila][col] = sc.nextInt();

            }
            System.out.println("");
        }

        System.out.print("Introduce el alumno que quieras calcular su media: ");
        alumno = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            suma += matriz[i][alumno-1];
        }
       
        mediaAlumno = suma / 3;
        System.out.println(mediaAlumno);
    }

}
