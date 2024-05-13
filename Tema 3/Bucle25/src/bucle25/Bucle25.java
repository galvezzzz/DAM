/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle25;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bucle25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, digito, resto = 0, cociente;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        num = sc.nextInt();

        while (num > 0) {
            resto = num % 10 + resto * 10;
            System.out.println(resto);
            num = num / 10;

            //System.out.println("Cociente: " + num);
        }
    }
}
