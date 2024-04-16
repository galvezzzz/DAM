/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg4;

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
        
        int altura, alturaMayor, suma=0, etiqueta=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura (cm): ");
        altura = sc.nextInt();
        
        alturaMayor = altura;
        
        while(altura != -1){
            suma++;
            
            if(altura>alturaMayor) {
                alturaMayor = altura;
                etiqueta = suma;
            }

            System.out.print("Introduce la altura (cm): ");
            altura = sc.nextInt();
        }
    
        System.out.println("El árbol más alto tendrá la etiqueta " + etiqueta + " y medirá " + alturaMayor);
    
        
    }
    
}
