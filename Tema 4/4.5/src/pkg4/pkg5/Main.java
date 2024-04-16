/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    static boolean esVocal(char c) {
        boolean resultado;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        boolean resultado;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un caracter en minúscula: ");
        c = sc.nextLine().charAt(0);
        
        resultado = esVocal(c);
        System.out.println("¿Es vocal el caracter introducido? " + resultado);
    }

}
