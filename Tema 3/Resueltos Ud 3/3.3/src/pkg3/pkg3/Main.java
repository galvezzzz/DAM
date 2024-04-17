/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg3;

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
        
        int secreto, num;
        Scanner sc = new Scanner(System.in);
        
        secreto = (int) (Math.random() * 99 + 1);
        
        System.out.println("Introduce un número del 1 al 100: ");
        num = sc.nextInt();
        
        while(num!=secreto && num>0)
            if(num>secreto){
                System.out.println(num + "mayor que el número " + secreto);
            }
            else if (num<secreto){
                System.out.println(secreto + "mayor que el número " + num);
                
            }
        if(num == secreto)System.out.println("Has ganado");
        else System.out.println("Has perdido");
    }
    
}
