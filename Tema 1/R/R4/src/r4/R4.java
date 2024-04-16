/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r4;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double n1, n2, sum, res, mul, div;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        n1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        n2 = sc.nextDouble();
        
        sum = n1+n2;
        res = n1-n2;
        mul = n1*n2;
        div = n1/n2;
        
        System.out.println("Resultado de la suma: " + sum);
        System.out.println("Resultado de la resta: " + res);
        System.out.println("Resultado de la multiplicación: " + mul);
        System.out.println("Resultado de la división: " + div);
        
        
    }
    
}
