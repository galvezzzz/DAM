/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle11;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
        los 5 primeros números enteros a partir de uno que se introduce por teclado.*/
        
        Scanner sc = new Scanner(System.in);
        int num, cuadrado, cubo;
        
        System.out.print("Introduce un número: ");
        num = sc.nextInt();
       
        for (int i = 0; i < 5; i++) {
            System.out.println("número: " + num);
            cuadrado = num*num; 
            cubo = num*num*num;

            System.out.println("Número al cuadrado: " + cuadrado);
            System.out.println("Número al cubo: " + cubo);
            num++;
        }
        /*while(num<=5){
            System.out.println("Siguiente número: " + num);
            cuadrado = num*num;
            cubo = num*num*num;

            System.out.println("Número al cuadrado: " + cuadrado);
            System.out.println("Número al cubo: " + cubo);
            num++;
        }*/
    }
}
