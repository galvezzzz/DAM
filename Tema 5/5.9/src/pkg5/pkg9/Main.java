/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int puntos[] = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Puntos del programador " + (i + 1) + ": ");
            puntos[i] = sc.nextInt();
        }
        
        Arrays.sort(puntos);
        System.out.println("Puntuación: " + Arrays.toString(puntos));
        
    }
    
}
