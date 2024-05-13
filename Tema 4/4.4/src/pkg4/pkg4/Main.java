/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static int max(int a, int b) {
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }
        return mayor;
    }

    public static void main(String[] args) {

        int a, b, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();
        
        resultado = max(a,b);
        System.out.println("El mayor será " + resultado);

    }

}
