/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg6p;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {

        int t[] = {1, 2, 3, 4, 5};
        int borrar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que quieres borrar: ");
        borrar = sc.nextInt();

        int indiceBorrado = Arrays.binarySearch(t, borrar);

        if (indiceBorrado >= 0) {

            System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, t.length - indiceBorrado - 1);
            t = Arrays.copyOf(t, t.length - 1);

            System.out.println(Arrays.toString(t));
        } else {
            System.out.println("El número no está en la tabla.");
        }

    }

}
