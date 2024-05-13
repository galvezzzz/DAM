/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg4;

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
        
        int cont = 0;
        String frase;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            
            if(Character.isWhitespace(frase.charAt(i))){
                cont++;
            }

        }
        
        System.out.println("La frase tendrá " + cont + " espacios");
    }
    
}
