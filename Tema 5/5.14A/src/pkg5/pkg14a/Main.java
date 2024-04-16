/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg14a;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {

        int sueldo = 0, cont = 0, media=0;
        int tablaSueldo[] = new int[0];
        Scanner sc = new Scanner(System.in);

        while (sueldo != -1) {
            System.out.print("Sueldo persona " + (cont + 1) + ": ");
            sueldo = sc.nextInt();

            if (sueldo != -1) {
                tablaSueldo = Arrays.copyOf(tablaSueldo, tablaSueldo.length + 1);
                tablaSueldo[cont] = sueldo;

                cont++;
            }
        }
        Arrays.sort(tablaSueldo);

        System.out.print("Decreciente: ");
        for (int i = tablaSueldo.length - 1; i >= 0; i--) {
            System.out.print(tablaSueldo[i] + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Sueldo mínimo: " + tablaSueldo[0]);
        System.out.println("Sueldo máximo: " + tablaSueldo[tablaSueldo.length - 1]);
        System.out.println("");

        
        //Media
        for (int i = 0; i < tablaSueldo.length; i++) {
            media =+ tablaSueldo[i];
            System.out.println(media);
        }
    }

}
