/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg14;

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

        int t[] = new int[0], num, cont = 0, suma = 0, media = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el sueldo numero " + cont + ": ");
        num = sc.nextInt();

        while (num != -1) {

            t = Arrays.copyOf(t, t.length + 1);
            t[cont] = num;
            cont++;

            System.out.print("Introduce el sueldo numero " + cont + ": ");
            num = sc.nextInt();
        }

        Arrays.sort(t);

        System.out.println("");
        System.out.print("Tabla decreciente: ");
        for (int i = (t.length - 1); i >= 0; i--) {
            System.out.print(t[i] + "  ");
        }

        System.out.println("");
        System.out.println("Dato mayor: " + t[t.length - 1]);
        System.out.println("Dato menor: " + t[0]);

        for (int i : t) {
            suma += i;
        }
        media = suma / t.length;
        System.out.println("La media es: " + media);

    }

}
