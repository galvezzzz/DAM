/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud3.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcion = 0;
        int num, cuadrado, modulo;
        double raiz;
        Scanner sc = new Scanner(System.in);

        do{
        //Creamos el menú
        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1.- Cuadrado de un número");
        System.out.println("2.- Raíz de un número (con 2 decimales)");
        System.out.println("3.- Módulo 5 de un número");
        System.out.println("4.- Salir");
        
        //Mientras que la opción no sea cuatro el bucle se realiza
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();
            //Si la opción no es adecuada mostramos un mensaje de error
            if (opcion < 1 || opcion > 4) {
                System.out.println("La opción introducida es incorrecta");
            } else {
                //Creamos un switch para cada opción posible
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Introduce un número: ");
                        num = sc.nextInt();
                        cuadrado = (int) Math.pow(num, 2);
                        System.out.println("El cuadrado de " + num + " será " + cuadrado);
                    }
                    case 2 -> {
                        System.out.print("Introduce un número: ");
                        num = sc.nextInt();
                        raiz = Math.sqrt(num);
                        System.out.println("La raíz cuadrada será " + raiz);
                    }
                    case 3 -> {
                        System.out.print("Introduce un número: ");
                        num = sc.nextInt();
                        modulo = (int) num % 5;
                        System.out.println("El módulo 5 de " + num + " será " + modulo);
                    }
                    case 4 ->
                        System.out.println("Fin del programa");
             
                }
            }
        } while(opcion != 4);
    }
}
