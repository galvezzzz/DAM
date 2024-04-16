/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

//    
    public static void main(String[] args) {

        String texto;
        Scanner sc = new Scanner(System.in);
        
        final char conjunto1[] = {'e','i','k','m','p','q','r','s','t','u','v'};
        final char conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'};

        System.out.print("Introduce una frase o palabra: ");
        texto = sc.nextLine();

        texto = texto.toLowerCase();

        char a[] = new char[texto.length()];

        a = texto.toCharArray();
        System.out.println(Arrays.toString(a));
    }

}
