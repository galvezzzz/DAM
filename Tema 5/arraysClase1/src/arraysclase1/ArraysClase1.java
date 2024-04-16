/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysclase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArraysClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int notas[], cont = 0, aux;
        notas = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Introduce las notas: ");
            aux = sc.nextInt();
            notas[cont] = aux;
            cont++;

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(notas[i]);
        }

    }

}
