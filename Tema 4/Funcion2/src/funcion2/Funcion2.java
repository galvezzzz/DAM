/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion2;

import java.util.Scanner;

public class Funcion2 {

    static boolean esPrimo(int n) {
        boolean primo = false;
        int resto, suma = 0;

        for (int i = 1; i <= n; i++) {
            resto = n % i;
            if (resto == 0) {
                suma += 1;
            }
        }
        if (suma <= 2) {
            primo = true;
        } else if (suma > 2) {
            primo = false;
        }
        return primo;
    }

    public static void main(String[] args) {

        boolean result;
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        result = esPrimo(n);

        System.out.println("¿Será primo el número introducido? " + result);

    }

}
