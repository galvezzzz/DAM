/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13a;

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
        int num1,num2,suma,resto;

        System.out.print("Escribe un número: ");
        num1 = sc.nextInt();
        
        System.out.print("Escribe el número que quieras transformar en su múltiplo: ");
        num2 = sc.nextInt();
     
        suma = num2 % num1;
        resto = Math.abs(suma - num1);
        
        System.out.println("Para llegar a un múltiplo de " + num1 + " con el número " + num2 + " hay que sumarle: " + resto);
        
       
    }
    
}
