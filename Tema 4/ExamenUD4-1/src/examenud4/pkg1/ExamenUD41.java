/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenud4.pkg1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ExamenUD41 {
    
    
    static boolean omirp(int num){
        
        boolean omirps;
        
        omirps = esPrimo(n) && esPrimo(reves);
    }

    //Generamos una función de tipo entero para darle la vuelta al número.
    static int reversa(int n) {
        int reves = 0;

        while (n > 0) {
            reves = (reves * 10) + (n % 10);
            n /= 10;
        }

        return reves;

    }
    //Generamos otra función para detectar si el número es primo.
    static boolean esPrimo(int n) {

        boolean primo = true;
        int cont = 2;

        while (cont < n && primo) {

            if (n % cont == 0) {
                primo = false;
            } else {
                cont++;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        System.out.print(n + ": ");
        
        //Comprobamos si el número en reversa es primo.
        n = reversa(n);
        System.out.println(esPrimo(n));
        
    }

}
