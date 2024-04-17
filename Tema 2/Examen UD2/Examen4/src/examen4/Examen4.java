/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, total, mayor, menor;
        
        //Introducimos un escáner 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();
        
        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();
        
        //Indicamos cual número será el mayor para ponerlo primero
        mayor = num1 > num2 ? num1 : num2;
        menor = num1 > num2 ? num2 : num1;
        
        //Con el booleano verificamos que el resto sea 0 para saber si es divisible o no
        total = mayor % menor;
        boolean respuesta = total == 0;
        
        System.out.println("Es el número " + mayor + " divisible por " + menor + "? " + respuesta);
        
        
    }
    
}
