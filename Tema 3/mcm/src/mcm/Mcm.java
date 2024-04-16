/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcm;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int mcm, a, b, mayor;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a: ");
        a = sc.nextInt();

        System.out.print("Introduce b: ");
        b = sc.nextInt();

        //Se puede hacer con la fórmula: (a*b)/mcd
        mayor = a > b ? a : b;
        mcm = mayor;
        while (mcm % a != 0 || mcm % b != 0) {
            mcm += mayor;
        }
        System.out.println("El mcm será: " + mcm);
    }

}
