/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ 
package pkg16a;

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
        
        double seg, min, hor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los segundos: ");
        seg = sc.nextDouble();
        
        min = seg / 60;
        hor = min / 60;
        System.out.println("Segundos: " + seg);
        System.out.println("Minutos: " + min);
        System.out.println("Horas: " + hor);
        
    }
    
}
