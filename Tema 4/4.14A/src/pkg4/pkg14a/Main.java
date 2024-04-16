/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg14a;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static int muestraSegundos(int dias, int hor, int min) {
        int seg;

        seg = (min * 60) + (hor * 3600) + (dias * 86400);

        return seg;

    }

    public static void main(String[] args) {

        int dias, hor, min;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de minutos: ");
        min = sc.nextInt();

        System.out.print("Introduce un número de horas: ");
        hor = sc.nextInt();

        System.out.print("Introduce un número de días: ");
        dias = sc.nextInt();

        System.out.println("El número de segundos totales será: " + muestraSegundos(dias, hor, min));

    }

}
