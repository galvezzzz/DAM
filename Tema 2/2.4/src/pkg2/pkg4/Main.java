/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg4;

import java.util.Locale;
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
        
        double num;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introduzca un número decimal: ");
        num = sc.nextDouble();
        
        
        if(num>-1 && num<1 && num!=0){
            System.out.println("El número es cuasi-cero");
        }
        else{
            System.out.println("El número no es cuasi-cero");
        }
    }
    
}
