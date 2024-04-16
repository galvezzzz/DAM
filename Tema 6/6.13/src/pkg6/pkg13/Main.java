/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg13;

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
        String frase;
        int[] cont = new int['z' - 'a' + 1];

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                cont[frase.charAt(i) - 'a']++;
            }

        }
        for (int i = 0; i < cont.length; i++) {
            if (cont[i] != 0) {
                System.out.println("La letra " + (char) ('a' + i) + " se repite " + cont[i] + " veces.");
            }
        }

    }

}
