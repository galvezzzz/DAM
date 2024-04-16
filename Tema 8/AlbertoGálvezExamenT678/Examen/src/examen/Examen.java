/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int eleccion;
        Scanner sc = new Scanner(System.in);
       
        Ejercito e1 = new Ejercito();
        Ejercito e2 = new Ejercito();
        
        System.out.println(e1);

        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1. Mostrar ejército");
        System.out.println("2. Atacar ejército 1");
        System.out.println("3. Atacar ejército 2");
        System.out.println("0. Salir");
        System.out.print("Introduce una opción: ");
        eleccion = sc.nextInt();

        while (eleccion < 0 || eleccion > 3) {
            System.out.println("");
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Mostrar ejército");
            System.out.println("2. Atacar ejército 1");
            System.out.println("3. Atacar ejército 2");
            System.out.println("0. Salir");
            System.out.print("Introduce una opción: ");
            eleccion = sc.nextInt();
        }

    }

}
