/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg13a;

import java.util.Comparator;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        int aleatorio;

        for (int i = 0; i < 30; i++) {
            aleatorio = (int) ((Math.random() * 10) + 1);
            c.insertarPrincipio(aleatorio);
        }

        System.out.println("Tabla desordenada: " + c);

        c.ordenar((Comparator<Integer>) c);

        System.out.println("Tabla ordenada: " + c);
    }
    
}
