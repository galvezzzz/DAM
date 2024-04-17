/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle26;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bucle26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, resto, digito, virao = 0, longitud = 0, aux;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        System.out.print("Introduce el dígito: ");
        digito = sc.nextInt();

        /*while (num > 0) {
            virao = num % 10 + virao * 10;
            num = num / 10;
        }

        for (int i = virao; i > 0; i /= 10) {
            resto = i % 10;
            if (cont == digito) {
                System.out.println(resto);
            }
            cont++;

        }*/
        //Calcula la longitud del valor
        aux = num;
        while (aux > 0) {
            longitud++;
            aux /= 10;
        }
        //Busca de dígitos
        System.out.print("El número se encuentra en las posiciones: ");
        int cont = 0;
        while (num > 0) {
            if (digito == (num % 10)) {
                //Salida
                System.out.print(longitud - cont + " ");
            }
            cont++;
            num /= 10;
        }
        System.out.println("");
    }

}
