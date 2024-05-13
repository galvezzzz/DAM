/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
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
        Scanner sc;
        double suma = 0, num;
        String linea;

        try {
            in = new BufferedReader(new FileReader("numeros.txt"));
            linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);

                if (sc.hasNextDouble()) {
                    num = sc.nextDouble();
                    suma += num;
                }

                linea = in.readLine();
            }

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

        System.out.println(suma);

    }

}
