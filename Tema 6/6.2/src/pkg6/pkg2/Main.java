/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg2;

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

        String a, b;

        System.out.print("Introduce la frase 1: ");
        a = sc.nextLine();

        System.out.print("Introduce la frase 2: ");
        b = sc.nextLine();

        if (a.length() > b.length()) {
            System.out.println("La frase 2 contiene menos caracteres.");
        } else {
            System.out.println("La frase 1 contiene menos caracteres.");
        }
    }

}
