/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej1Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String valido;
        int carrera, andando, bici;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce los kilómetros de carrera: ");
        carrera = sc.nextInt();
        
        System.out.print("Introduce los kilómetros andando: ");
        andando = sc.nextInt();
        
        System.out.print("Introduce los kilómetros de bicicleta: ");
        bici = sc.nextInt();
        
        valido = ((carrera>40 || (andando >= 40 && carrera >= 20)) && bici >= 100) ? "Válido" : "No válido";
        
        System.out.println(valido);
    }
    
}
