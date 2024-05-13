/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg6;

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
        String cons = "";
        String nombre;
        Scanner sc = new Scanner(System.in , "ISO-8859-1");

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {

            if (nombre.charAt(i) != 'a' && nombre.charAt(i) != 'e' && nombre.charAt(i) != 'i'
                    && nombre.charAt(i) != 'o' && nombre.charAt(i) != 'u' && nombre.charAt(i) != 'A' && nombre.charAt(i) != 'I' && nombre.charAt(i) != 'O'
                    && nombre.charAt(i) != 'E' && nombre.charAt(i) != 'U' && nombre.charAt(i) != 'á' && nombre.charAt(i) != 'é' && nombre.charAt(i) != 'í'
                    && nombre.charAt(i) != 'ó' && nombre.charAt(i) != 'ú' && nombre.charAt(i) != 'Á' && nombre.charAt(i) != 'Í' && nombre.charAt(i) != 'Ó'
                    && nombre.charAt(i) != 'É' && nombre.charAt(i) != 'Ú') {

                cons += nombre.charAt(i);
            }

        }
        System.out.println(cons);

    }

}
