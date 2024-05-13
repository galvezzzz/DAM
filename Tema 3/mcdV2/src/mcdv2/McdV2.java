/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcdv2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class McdV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a, b, mcd;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();

        mcd = (a < b) ? a : b;
        while (a % mcd != 0 || b % mcd != 0) {
            mcd--;
        }
        System.out.println("El MCD será: " + mcd);
    }

}
