/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propuesta.pkg3.pkg3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Propuesta33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, d;
        System.out.print("Introduce un número positivo: ");
        num = sc.nextInt();
        
       
        if(num>0){
            while(num>0){
            d=num%10;
            System.out.println(d);
            num/=10;
            }
        }else{
            System.out.println("El número es negativo");
        }
        
        
    }
    
}
