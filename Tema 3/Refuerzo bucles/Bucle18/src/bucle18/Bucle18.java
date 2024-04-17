/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle18;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n1, n2, mayor, menor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        n1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        n2 = sc.nextInt();

        while (n1 == n2) {
            System.out.println("Los números son iguales, vuelva a introducir sus valores.");

            System.out.print("Introduce el primer número: ");
            n1 = sc.nextInt();

            System.out.print("Introduce el segundo número: ");
            n2 = sc.nextInt();
        }

        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }
        for (int i = menor; i < mayor; i += 7) {
            System.out.println(i);
        }

    }

}
