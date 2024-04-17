/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg8;

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
        
        double a, b, c, x1, x2, r;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor de a: ");
        a = sc.nextDouble();
        
        System.out.print("Valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Valor de c: ");
        c = sc.nextDouble();
        
        x1 = -b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
        x2 = -b-Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a;
        
        r = b * b - 4 * a * c;
              
        if (r < 0){
            System.out.println("No tiene solución");
            
        }else if (a == 0){
           
            System.out.println("No se puede dividir entre cero");
            
        }else{
            System.out.println("Primera solución: " + x1);
            System.out.println("Segunda solución: " + x2);
                
        }
            
    }
    
}
