/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysclasedni;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArraysClaseDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int num, modulo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        modulo = num % 23;
        System.out.println("DNI: " + letra[modulo]);
    }
    
}
