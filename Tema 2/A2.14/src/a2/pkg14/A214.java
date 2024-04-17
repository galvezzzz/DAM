/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class A214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, num2, num3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
   
        num2 = num % 10;
        num2 = num / 10;
        
        switch(num){
            case 10 -> {System.out.println("Diez");}
            case 11 -> {System.out.println("Once");}
            case 12 -> {System.out.println("Doce");}
            case 13 -> {System.out.println("Trece");}
            case 14 -> {System.out.println("Catorce");}
            case 15 -> {System.out.println("Quince");}
            case 16 -> {System.out.println("Dieciseis");}
            case 17 -> {System.out.println("Diecisiete");}
            case 18 -> {System.out.println("Dieciocho");}
            case 19 -> {System.out.println("Diecinueve");}
            case 20 -> {System.out.println("Veinte");}
                         
        }
        
        if(num2 <= 10){
            switch(num2){
                case 2 -> {System.out.print("Veinti");}
                case 3 -> {System.out.print("Treinta y ");}
                case 4 -> {System.out.print("Cuarenta y ");}
                case 5 -> {System.out.print("Cincuenta y ");}
                case 6 -> {System.out.print("Sesenta y ");}
                case 7 -> {System.out.print("Setenta y ");}
                case 8 -> {System.out.print("Ochenta y ");}
                case 9 -> {System.out.print("Noventa y ");}
                }
            
        num3 = num % 10;
            
        if(num3 <= 10){
            switch(num3){
                case 0 -> {System.out.println("cero");}
                case 1 -> {System.out.println("uno");}
                case 2 -> {System.out.println("dos");}
                case 3 -> {System.out.println("tres");}
                case 4 -> {System.out.println("cuatro");}
                case 5 -> {System.out.println("cinco");}
                case 6 -> {System.out.println("seis");}
                case 7 -> {System.out.println("siete");}
                case 8 -> {System.out.println("ocho");}
                case 9 -> {System.out.println("nueve");}
                
            }
            
        }
       
    }
    
}}
