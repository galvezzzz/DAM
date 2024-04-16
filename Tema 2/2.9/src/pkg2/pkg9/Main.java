/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg9;

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
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entre el 0 y 99.999: ");
        num = sc.nextInt();
        
        if(num<10){
            System.out.println("El número posee una cifra");
            
        }else if(num<100){
            System.out.println("El número posee dos cifras");
            
        }else if(num<1000){
            System.out.println("El número posee tres cifras");
            
        }else if(num<10000){
            System.out.println("El número posee cuatro cifras");
            
        }else if(num<100000){
            System.out.println("El número posee cinco cifras");
        }
    }
    
}
