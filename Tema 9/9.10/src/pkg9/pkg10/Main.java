/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg10;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Integer lista[] = new Integer[20];

        for (int i = 0; i < lista.length; i++) {
            int aleatorio  = (int) (Math.random() * 100 + 1);
            lista[i] = aleatorio;
        }

        System.out.println(Arrays.toString(lista));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));

        
    }
    
}
