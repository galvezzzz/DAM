/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg1;

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
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
        
        while(num != 0){
        
            if(num % 2 == 0){
            System.out.println("El número es par");
            }else{
                System.out.println("El número es impar");
            }
            if(num >= 0){
            System.out.println("Es positivo");
            }else{
                System.out.println("Es negativo");
            }
            System.out.println("El número al cuadrado será: " + Math.pow(num, 2));
            
            System.out.print("Introduce otro número: ");
            num = sc.nextInt();
        }
    }
    
}
