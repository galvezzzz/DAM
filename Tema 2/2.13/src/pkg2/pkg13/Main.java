/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg13;

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
        
        int hora, min, seg;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca hora: ");
        hora = sc.nextInt();
        
        System.out.println("Introduzca minutos: ");
        min = sc.nextInt();
        
        System.out.println("Introduzca segundos: ");
        seg = sc.nextInt();
        
        seg++;
        if (seg > 59){
            seg = 0;
        min++;
        if (min > 59){
            min = 0;
        hora++;
        if (hora > 23){
            hora = 0;
            
        }
    }
}
        System.out.println("Hora + 1 segundo: " + hora + " : " + min + " : " + seg);

    }
}    
            
        

