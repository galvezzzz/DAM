/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD42 {

    static void altura(int h) {

        for (int i = 0; i < h; i += 100) {
            System.out.println(i);
        }

    }

    static double gravedad(double h) {
        final int R = 6370000;
        double g=0;
        double hEnMetros;
        
        hEnMetros = h * 1000;

        for (int i = 0; i < hEnMetros; i += 100000) {
            g = 9.8 * (Math.pow(R, 2) / Math.pow(R + i, 2));
            
            System.out.println(g);
        }

        return g;
    }
    static void funcion(){
        int h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altitud: ");
        h = sc.nextInt();

        System.out.print("Altitud (km)");
        System.out.print("        ");
        System.out.print("Gravedad (m/s2)");

        System.out.println("");

        System.out.print("____________");
        System.out.print("        ");
        System.out.print("_______________");

        System.out.println("");

        altura(h);
        System.out.print("             ");
        System.out.printf(".2f \n",gravedad(h));
    }

    public static void main(String[] args) {

        funcion();

    }

}
