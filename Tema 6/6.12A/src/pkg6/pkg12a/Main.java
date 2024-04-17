/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg12a;

import java.util.Arrays;
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
        String palabra;
        char letras[], adivina;
        int intentos = 7;

        System.out.print("El jugador A teclea una palabra: ");
        palabra = sc.nextLine();

        palabra = palabra.toLowerCase();
        letras = palabra.toCharArray();

        System.out.println("La palabra contiene " + palabra.length() + " letras");

        //Imprimimos las líneas
        for (int i = 0; i < letras.length; i++) {
            System.out.print("_ ");
        }

        System.out.println("");
        System.out.println("");

        do {
            System.out.print("Introduce una letra: ");
            adivina = sc.nextLine().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {

                if (letras[i] == adivina) {
                    System.out.print(adivina + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            intentos--;
            System.out.println("");

        } while (intentos > 0);

    }
}
