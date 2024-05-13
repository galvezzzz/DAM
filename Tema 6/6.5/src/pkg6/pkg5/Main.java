/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static void invertida(String cadena){
        
        String reves = "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reves += cadena.charAt(i);
            
        }
        System.out.println(reves);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        System.out.print("Introduce una frase para invertir: ");
        cadena = sc.nextLine();
        
        invertida(cadena);
    }
    
}
