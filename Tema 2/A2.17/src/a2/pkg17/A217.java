/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg17;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            int num, num2, resultado;
            double aleatorio;

            aleatorio = Math.random();
            
            num = (int) (aleatorio*99 + 1);
            System.out.print(num + " + ");

            aleatorio = Math.random();

            num2 = (int) (aleatorio*99 + 1);
            System.out.println(num2);
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Calcula el resultado de la suma de los números anteriores: ");
            resultado = sc.nextInt();

            if(resultado == num + num2)
                System.out.println("El resultado es correcto");
            else{
                System.out.println("El resultado es incorrecto");
        }
    } 
}
