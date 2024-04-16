/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numSecreto, num;

        //Creamos un número aleatorio entre 1 y 100
        numSecreto = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        //Mientras que el número no sea el secreto ni -1, el juego continúa
        while (num != numSecreto && num != -1) {
            //Indicamos si es mayor o menor el número introducido que el secreto
            if (num > numSecreto) {
                System.out.println(num + " es mayor que el número secreto");
            } else if (num < numSecreto) {
                System.out.println(num + " es menor que el número secreto");
            }
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }
        //El mensaje se imprime si acierta el número secreto
        if (num == numSecreto) {
            System.out.println("¡Enhorabuena! Has acertado el número secreto.");
        }
        System.out.println("Fin del juego");
    }

}
