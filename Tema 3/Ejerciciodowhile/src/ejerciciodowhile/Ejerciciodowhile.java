/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodowhile;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejerciciodowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, num2, resultado, operacion;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número del 1 al 5: ");
        operacion = sc.nextInt();
        
        do{
            
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            
            System.out.print("Introduce otro número: ");
            num2 = sc.nextInt();
            
            if(operacion==1){
                resultado = num + num2;
                System.out.println("Suma: " + resultado);
            }
            if(operacion==2){
                resultado = num - num2;
                System.out.println("Resta: " + resultado);
            }
            if(operacion==3){
                resultado = num*num2;
                System.out.println("Multiplicación: " + resultado);
            }
            if(operacion==4){
                resultado = num/num2;
                System.out.println("División: " + resultado);
            }
            System.out.print("Introduce un número del 1 al 5: ");
            operacion = sc.nextInt();
            
        }while(operacion != 5);
    }
}

                
        
