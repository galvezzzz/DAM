/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        //Bucle indefinido
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        //Inicialización de la condición del bucle
        //num = 1; 
        
        //Establecemos la condición del bucle
        while (num >= 0){
            System.out.println(Math.pow(num, 2));
            
            //num++; //Modificación de la condición del bucle
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
    }
    
}
