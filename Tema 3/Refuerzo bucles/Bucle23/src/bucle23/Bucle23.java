/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle23;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 0, suma = 0, cont = 0, media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        while (suma + num < 10000) {
            suma += num;
            cont++;
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }
        media = suma / cont;
        System.out.println("Has introducido " + cont + " números que suman " + suma);
        System.out.println("La media de todos los números será " + media);
    }

}
