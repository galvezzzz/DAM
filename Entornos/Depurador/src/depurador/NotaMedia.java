/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depurador;

/**
 *
 * @author Usuario
 */
//package programas;
import java.util.Scanner;

public class NotaMedia {

    public static void main(String[] args) {
        int[] notas = new int[15];

        notas = leerNotas();
        System.out.println("La nota media es un " + calcularNotaMedia(notas));

    }

    private static int[] leerNotas() {

        int[] notas = new int[15];
        Scanner teclado = new Scanner(System.in);

        for (int contador = 0; contador < notas.length; ++contador) {
            System.out.print("Introduzca una nota: ");
            /*Leemos un número entero por teclado y lo almacenamos en la posición contador del array*/
            notas[contador] = teclado.nextInt();
        }
        teclado.close();
        return notas;
    }

    private static double calcularNotaMedia(int[] notas) {
        int suma = 0;

        //Recorremos el array para sumar todas las notas
        for (int contador = 0; contador < notas.length; ++contador) {

            suma = suma + notas[contador];

        }
        /*Obtenemos la nota media como el resultado de dividir la suma de todas las notas entre el número de notas*/
        float media = (float) suma / notas.length;
        return media;
    }
}
