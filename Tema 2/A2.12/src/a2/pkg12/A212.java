/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca su número de DNI sin letra: ");
        num = sc.nextInt();
        
        num = num % 23;
        
        switch(num){
            case 0 -> {
                System.out.println("T");
            }
            case 1 -> {
                System.out.println("R");
            }       
            case 2 -> {
                System.out.println("W");
            }  
            case 3 -> {
                System.out.println("A");
            }    
            case 4 -> {
                System.out.println("G");
            }
            case 5 -> {
                System.out.println("M");
            }       
            case 6 -> {
                System.out.println("Y");
            }  
            case 7 -> {
                System.out.println("F");
            }
            case 8 -> {
                System.out.println("P");
            }
            case 9 -> {
                System.out.println("D");
            }       
            case 10 -> {
                System.out.println("X");
            }  
            case 11 -> {
                System.out.println("B");
            }    
            case 12 -> {
                System.out.println("N");
            }
            case 13 -> {
                System.out.println("J");
            }       
            case 14 -> {
                System.out.println("Z");
            }  
            case 15 -> {
                System.out.println("S");
            }    
            case 16 -> {
                System.out.println("Q");
            }
            case 17 -> {
                System.out.println("V");
            }       
            case 18 -> {
                System.out.println("H");
            }  
            case 19 -> {
                System.out.println("L");
            }
            case 20 -> {
                System.out.println("C");
            }
            case 21 -> {
                System.out.println("K");
            }       
            case 22 -> {
                System.out.println("E");
            }  
    }       
    }
}
