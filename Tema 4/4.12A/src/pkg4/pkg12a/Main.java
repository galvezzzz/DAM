/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg12a;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Main {

    static double distancia(double x1, double x2, double y1, double y2) {
        double distancia, restax, restay;
        restax = x1 - x2;
        restay = y1 - y2;
        distancia = Math.sqrt((Math.pow(restax, 2)) + (Math.pow(restay, 2)));

        return distancia;
    }

    public static void main(String[] args) {

        double x1, x2, y1, y2, resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce x1: ");
        x1 = sc.nextDouble();
        
        System.out.print("Introduce x2: ");
        x2 = sc.nextDouble();
        
        System.out.print("Introduce y1: ");
        y1 = sc.nextDouble();
        
        System.out.print("Introduce y2: ");
        y2 = sc.nextDouble();
        
        resultado = distancia(x1, x2, y1, y2);
        System.out.println(resultado);
        
    }

}
