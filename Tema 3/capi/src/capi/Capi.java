/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capi;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Capi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, d1, d2, d3, d4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        
        
        d1 = num % 10;
        num = num / 10;
        d2 = num % 10;
        num = num / 10;
        d3 = num % 10;
        num = num / 10;
        d4 = num % 10;
        
        if(num<10){
            System.out.println("Es capi");
        }else if(d1==d4 && d2==d3){
            System.out.println("Es capi");
        }else if(d1==d3 && d2==0 && d4==0){
            System.out.println("Es capi");
        }else{
            System.out.println("No es capi");
        }
    }
}
