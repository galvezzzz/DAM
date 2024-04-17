/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palotes;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Palotes {

    public static int reversa(int n) {

        int reves = 0;

        while (n > 0) {
            reves = (reves * 10) + (n % 10);
            n /= 10;
        }
        return reves;
    }

    public static String palotes(int n) {

        String palos = "";
        int dig, cont = 0;

        n = reversa(n);
        
        if (n == 0) {
                palos += ("-- ");
            }


        while (n != 0) {

            
            dig = n % 10;
            n /= 10;
            cont = dig;

            while (cont > 0) {
                palos += "/ ";
                cont--;
            }

            if (n > 0) {
                palos += "- ";
            }

        }

        return palos;

    }

    public static void main(String[] args) {

        System.out.println(palotes(470213));
    }

}
