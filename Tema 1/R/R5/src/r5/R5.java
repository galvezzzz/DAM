/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r5;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la base del rectángulo: ");
        base = sc.nextDouble();
        
        System.out.print("Introduzca la altura del rectángulo: ");
        altura = sc.nextInt();
        
        area = base*altura;
        
        System.out.println("El área del rectángulo será: " + area);
        
        
    }
    
}
