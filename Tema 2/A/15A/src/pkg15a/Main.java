/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15a;

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

        double a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de a: ");
        a = sc.nextDouble();
        System.out.print("Valor de b: ");
        b = sc.nextDouble();
        System.out.print("Valor de c: ");
        c = sc.nextDouble();
        System.out.print("Valor de x: ");
        x = sc.nextDouble();
        
        y = a*(x*x) + b*x + c;
        System.out.println("Valor total de y: " + y);
    }
    
}
