/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ej4Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String piedra, papel, tijera, jugada;
        int aleatorio, nPiedra=0, nPapel=0, nTijera=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la jugada (piedra, papel, tijera): ");
        jugada = sc.nextLine();
        
        aleatorio = (int) Math.random()*3;
        
        switch(jugada){
            case "piedra" ->{
                nPiedra = 1;
            }
            case "papel" ->{
                System.out.println("Papel");
                nPapel = 2;
            }
            case "tijera" ->{
                System.out.println("Tijera");
                nTijera = 3;
            }
        }
        if(aleatorio>nPiedra && aleatorio<nTijera)
        System.out.println("Ordenador: " + aleatorio);
        System.out.println("El ordenador gana");
    }
    
}
