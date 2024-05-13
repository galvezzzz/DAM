/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg10;

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

        boolean espacio = false;
        String frase="", reves = "", leer;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase (sin tildes): ");
        leer = sc.nextLine();

        for (int i = leer.length() - 1; i >= 0; i--) {
            espacio = Character.isSpaceChar(leer.charAt(i));

            if (!espacio) {
                reves += leer.charAt(i);
            }

        }
        
        for (int i = 0; i < leer.length(); i++) {
            espacio = Character.isSpaceChar(leer.charAt(i));
            
            if (!espacio) {
                frase += leer.charAt(i);
            }
        }
        
        System.out.println(frase);
        System.out.println(reves);
        if (reves.equals(frase)) {
            System.out.println("Es palíndroma");

        } else {
            System.out.println("No es palíndroma");
        }
    }

}
