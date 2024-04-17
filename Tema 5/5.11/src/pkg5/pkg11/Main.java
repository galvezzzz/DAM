/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg11;

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

        int longitud, intentos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de dígitos que tendrá la contraseña: ");
        longitud = sc.nextInt();

        int combi[] = new int[longitud];
        int combiJugador[] = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            combi[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.println(Arrays.toString(combi));

        while (intentos < longitud || Arrays.equals(combi, combiJugador) == true) {

            for (int i = 0; i < longitud; i++) {
                System.out.print("Introduce la contraseña: ");
                combiJugador[i] = sc.nextInt();
            }

            System.out.println("Contraseña introducida: " + Arrays.toString(combiJugador));

            System.out.println(Arrays.equals(combi, combiJugador));

            if (Arrays.equals(combi, combiJugador) == false) {
                for (int i = 0; i < longitud; i++) {
                    System.out.println("Pista: " + combi[i]);
                }
            }

            intentos++;

        }

    }

}
