/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle9;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class Bucle9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        long numeroIntroducido, n;
        int numeroDigitos=1;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número entero: ");
        numeroIntroducido = sc.nextLong();
        
        n = numeroIntroducido;

        while (n >= 10) {
          numeroDigitos++;
          n /= 10;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " dígitos.");
    }
}
    

