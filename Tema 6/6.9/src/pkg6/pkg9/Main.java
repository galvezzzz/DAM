/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg9;

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

        String palabra;
        String frase = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce palabras para montar una frase: ");
        palabra = sc.nextLine();

        while (!palabra.toLowerCase().equals("fin")) {
            frase += palabra + " ";

            System.out.print("Introduce palabras para montar una frase: ");
            palabra = sc.nextLine();
        }
        
        System.out.println(frase);
    }
}
