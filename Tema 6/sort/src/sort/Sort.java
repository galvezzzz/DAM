/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Sort {

    static void ordenacion(int a[]) {

        int indiceMenor, aux;

        for (int i = 0; i < a.length - 1; i++) {

            //Busco menor
            indiceMenor = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;

                }
            }

            //Intercambio valores
            if (i != indiceMenor) {
                aux = a[i];
                a[i] = a[indiceMenor];
                a[indiceMenor] = aux;

            }
        }
    }

    public static void main(String[] args) {

        int t[] = {2, 5, 4, 3, 1};

    }

}
