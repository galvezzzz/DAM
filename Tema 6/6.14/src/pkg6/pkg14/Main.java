/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra, intento, palabraClave;
        char aux;

        final char[] letras;

        System.out.print("Introduce la palabra: ");
        palabraClave = sc.nextLine();

        letras = palabraClave.toCharArray();

        //Calculamos el anagrama aleatorio
        for (int i = 0; i < palabraClave.length(); i++) {
            int aleatorio = (int) (Math.random() * letras.length);

            aux = letras[i];
            letras[i] = letras[aleatorio];
            letras[aleatorio] = aux;
        }
        palabra = String.valueOf(letras);

        System.out.println("Pista: " + palabra);

        System.out.print("Adivina la palabra clave: ");
        intento = sc.nextLine();

        while (!intento.equals(palabraClave)) {
            System.out.print("Adivina la palabra clave: ");
            intento = sc.nextLine();
        }

        System.out.println("¡¡Has acertado!!");

    }

}
