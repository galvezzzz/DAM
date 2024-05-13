/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        final char[] letras1;
        final char[] letras2;

        System.out.print("Introduce la primera palabra: ");
        palabra1 = sc.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        palabra2 = sc.nextLine();

        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        letras1 = palabra1.toCharArray();
        letras2 = palabra2.toCharArray();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("Las palabras no son anagramas.");
        } else {
            Arrays.sort(letras1);
            Arrays.sort(letras2);

            if (Arrays.equals(letras1, letras2)) {
                System.out.println("Son anagramas.");
            } else {
                System.out.println("Las palabras no son anagramas.");
            }
        }

    }

}
