/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    //Creamos la función del rombo.
    static void rombo(int altura) {

        for (int columnas = 1; columnas <= altura; columnas++) {
            System.out.println("");

            //Los espacios serán proporcionales a la altura
            for (int spc = 1; spc <= (altura + 4) - columnas; spc++) {
                System.out.print(" ");
            }
            
            //Imprimimos el primer triángulo
            for (int filas = 1; filas <= columnas; filas++) {
                System.out.print("*");
            }

            for (int der = 0; der < columnas - 1; der++) {
                System.out.print("*");
            }

        }

        for (int columnas = altura - 1; columnas > 0; columnas--) {
            System.out.println("");

            for (int spc = 1; spc <= (altura + 4) - columnas; spc++) {
                System.out.print(" ");
            }
            
            //Imprimimos el segundo triángulo (inverso)
            for (int filas = 1; filas <= columnas; filas++) {
                System.out.print("*");
            }

            for (int der = 0; der < columnas - 1; der++) {
                System.out.print("*");
            }

        }
    }
    
    //Creamos la función del triángulo.
    static void triangulo(int altura) {
        
        for (int columnas = 1; columnas <= altura + 4; columnas++) {
            System.out.println("");

            for (int spc = 1; spc <= (altura + 4) - columnas; spc++) {
                System.out.print(" ");
            }

            for (int filas = 1; filas <= columnas; filas++) {
                System.out.print("*");
            }

            for (int der = 0; der < columnas - 1; der++) {
                System.out.print("*");
            }
        }   
        
    }    

    //Creamos la función del tronco.
    static void tronco(int altura) {
        
        for (int columnas = 1; columnas <= 4; columnas++) {
            System.out.println("");

            //Creamos espacios para centrar el tronco
            for (int i = 0; i < altura + 2; i++) {
                System.out.print(" ");
            }

            //Imprimimos el tronco
            for (int filas = 0; filas < 3; filas++) {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {

        int altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del árbol: ");
        altura = sc.nextInt();

        rombo(altura);
        triangulo(altura);
        tronco(altura);
        System.out.println("");
    }

}
