/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        
        if (num%2 == 0){
            System.out.println("Es par");
            
        }
        else{
        System.out.println("Es impar");
        }
    }
    
}
