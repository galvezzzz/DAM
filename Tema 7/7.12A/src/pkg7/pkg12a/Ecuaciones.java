/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg12a;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ecuaciones {

    private int a;
    private int b;
    private int c;
    int sol[] = new int[2];

    public Ecuaciones(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void mostrar() {
        System.out.println(Arrays.toString(ecuacion()));
    }

    public int[] ecuacion() {
        sol[0] = (int) (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/ 2 * a;
        sol[1] = (int) (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c))))/ 2 * a;
        return sol;
    }

//    public void discriminante() {
//        if (sol > 0) {
//            System.out.println("El discriminante es positivo");
//        } else {
//            System.out.println("El discriminante es negativo");
//        }
//    }
}
