/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r9;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class R9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radio, altura, volumen;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Radio del cono: ");
        radio = sc.nextDouble();
        
        System.out.print("Altura del cono: ");
        altura = sc.nextDouble();
        
        volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;
        
        System.out.println("Volumen del cono: " + volumen);
        
        
    }
    
}
