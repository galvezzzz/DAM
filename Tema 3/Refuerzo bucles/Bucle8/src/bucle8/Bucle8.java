/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle8;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber su tabla de multiplicar: ");
        int num = sc.nextInt();
        int tabla=0;
        
        /*for(tabla=0;tabla<=10;tabla++){
            System.out.println(tabla*num);
        }*/
        while(tabla<=10){
            
            System.out.println(tabla*num);
            tabla++;
        }
    }
}
