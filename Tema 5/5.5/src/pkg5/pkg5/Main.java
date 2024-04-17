/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static int generaPar(int fin) {

        int aleatorio, numPar = 0;

        for (int i = 0; i < fin; i++) {
            aleatorio = (int) (Math.random() * fin + 1);

            if (aleatorio % 2 == 0) {
                numPar = aleatorio;
            }
        }

        return numPar;

    }

    static int[] rellenaPares(int longitud, int fin) {

        int num[];

        num = new int[longitud];

        for (int i = 0; i < num.length; i++) {

            num[i] = generaPar(fin);
        }

        Arrays.sort(num);

        return num;
    }

    public static void main(String[] args) {

        int longitud, fin;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        longitud = sc.nextInt();

        System.out.print("Introduce fin: ");
        fin = sc.nextInt();

        for (int valor : rellenaPares(longitud, fin)) {
            System.out.print(valor + " ");
        }
        System.out.println("");

    }

}
