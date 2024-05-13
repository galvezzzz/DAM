/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg18;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, num2, resultado = 0, operacion, result = 0;
        double aleatorio;
        
        Scanner sc = new Scanner(System.in);

        aleatorio = Math.random();
        num = (int) (aleatorio*99 + 1);

        aleatorio = Math.random();
        num2 = (int) (aleatorio*99 + 1);
        
        operacion = (int) Math.random() * 3 + 1;
        
        switch(operacion){
            case 1 -> { System.out.print("Suma " + num + " + " +num2 + " = ");
            resultado = sc.nextInt();
            result = num + num2;
            }
            case 2 -> { System.out.print("Resta " + num + " - " +num2 + " = ");
            resultado = sc.nextInt();
            result = num - num2;
            }
            case 3 -> { System.out.print("Multiplica " + num + " * " +num2 + " = ");
            resultado = sc.nextInt();
            result = num - num2;
            }
        }
        
        if(resultado == result)
            System.out.println("El resultado es correcto");
        else{
            System.out.println("El resultado es incorrecto");
        }
    }
    
}

