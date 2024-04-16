/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg12a;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    static void desordenar(int t[]) {

        System.out.println("Ordenado: " + Arrays.toString(t));

        for (int i = 0; i < t.length; i++) {

            //generamos posicion aleatoria 
            int posAleatoria = (int) (Math.random() * t.length);

            //almacenamos el valor de esa posicion aleatoria
            int temp = t[i];

            //asignamos la posicion aleatoria a nuestro array
            t[i] = t[posAleatoria];

            //a esa posicion aleatoria se le asigna un valor del array
            t[posAleatoria] = temp;
        }

        System.out.println("Desordenado: " + Arrays.toString(t));
    }

    public static void main(String[] args) {

        int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        desordenar(arrayEnteros);
    }

}
