/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg8;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final String inicio = "Javal�n, javal�n";
        final String fin = "javal�n, len, len";
        String frase;
        boolean idiomaJ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la frase: ");
        frase = sc.nextLine();

        idiomaJ = false;

        if (frase.startsWith(inicio)) {
            idiomaJ = true;

        } else if (frase.endsWith(fin)) {
            idiomaJ = true;
        }

        if (idiomaJ) {
            System.out.println("Está escrito en idioma Java");
        } else {
            System.out.println("Está escrito normal");
        }
    }

}
