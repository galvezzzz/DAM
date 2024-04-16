/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6.pkg3;

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

        String con, intentos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la contraseña: ");
        con = sc.nextLine();

        //Primera versión
        do {
            System.out.print("Trata de adivinar la contraseña: ");
            intentos = sc.nextLine();

            if (con.length() < intentos.length()) {
                System.out.println("La contraseña tiene menos caracteres");
            } else if (con.length() > intentos.length()) {
                System.out.println("La contraseña tiene más caracteres");
            }

        } while (con.equals(intentos) == false);
        // (!con.equals(intentos));

        //Segunda versión
//        System.out.println("La longitud de la contraseña es de " + con.length());
//        System.out.println();
//
//        System.out.print("Trata de adivinar la contraseña: ");
//        intentos = sc.nextLine();
//
//        while (con.equals(intentos) == false) {
//
//            if (con.regionMatches(0, intentos, 0, intentos.length()) == true) {
//                
//            }
//            
//            System.out.print("Trata de adivinar la contraseña: ");
//            intentos = sc.nextLine();
//       
    }

}
