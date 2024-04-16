/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r6;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la base del triángulo: ");
        base = sc.nextDouble();
        
        System.out.print("Introduzca la altura del triángulo: ");
        altura = sc.nextInt();
        
        area = (base*altura)/2;
        
        System.out.println("El área del triángulo será: " + area);
    }
    
}
