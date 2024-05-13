/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14a;

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
        
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor base: ");
        base = sc.nextInt();
        System.out.print("Valor altura: ");
        altura = sc.nextInt();
        
        area = (base * altura)/2;
        System.out.println("El área del triángulo será: " + area);
        
    }       
    
}
