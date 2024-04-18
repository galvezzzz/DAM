/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Scanner;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeros[] = new int [5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 5 nums: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(numeros));
    }
    
}
