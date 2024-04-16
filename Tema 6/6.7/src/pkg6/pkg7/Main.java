/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg7;

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

        int pos, cont = 0;
        String palabra, frase;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        pos = frase.indexOf(palabra);
        
        if (pos > 0) {
            cont++;
        }

        System.out.println("La palabra " + palabra + " aparece " + cont + " veces.");
    }

}
