/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg17a;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Declaración y lectura de variables
        String palabra;
        int secuencia;

        System.out.print("Introduce la palabra: ");
        palabra = sc.nextLine();

        while (!palabra.isEmpty()) {

            if (palabra.length() >= 4) {
                secuencia = 4;
            } else {
                secuencia = palabra.length();
            }
            System.out.println(palabra.substring(0,secuencia));
            palabra = palabra.substring(secuencia);
        }
    }

}
