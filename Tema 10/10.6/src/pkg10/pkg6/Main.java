/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        BufferedReader in = null;
        int numeros, cont = 0;
        double media = 0;

        try {
            in = new BufferedReader(new FileReader("Enteros.txt"));
      
            Scanner sc = new Scanner(in);
            while (sc.hasNextInt()) {
                numeros = sc.nextInt();
                System.out.print(numeros + " ");
                media += numeros;
                cont++;
            }
            System.out.println("");
            System.out.println("Media: " + media / cont);
            System.out.println("Suma: " + media);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }

}
