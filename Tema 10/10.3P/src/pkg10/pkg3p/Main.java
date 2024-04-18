/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg3p;

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
        String linea, nombre = "";

        try {
            in = new BufferedReader(new FileReader("Jugadores.txt"));
            linea = in.readLine();

            while (linea != null) {
                sc = new Scanner(linea).useLocale(Locale.US);
                nombre += linea + "\n";
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

        System.out.println(nombre);

    }

}
