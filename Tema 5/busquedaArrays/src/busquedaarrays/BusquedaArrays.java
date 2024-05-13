/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedaarrays;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class BusquedaArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[] = {11, 2, 43, 14};
        int valor, i;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        valor = sc.nextInt();

        i = 0;
        while (i < numeros.length && valor != numeros[i]) { //Comprobamos siempre primero la longitud
            i++;
        }

        if (i == numeros.length) {
            System.out.println("El elemento no se encuentra.");
        } else {
            System.out.println("El número se encuentra en " + i);
        }
    }

}
