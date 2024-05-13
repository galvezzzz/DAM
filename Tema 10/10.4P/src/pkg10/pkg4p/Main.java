/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg4p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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

        Scanner sc = new Scanner(System.in);
        BufferedWriter out = null;
        BufferedReader in = null;
        String cad, linea = "";

        try {

            out = new BufferedWriter(new FileWriter("texto.txt"));

            System.out.print("Escribe un texto de prueba: ");
            cad = sc.nextLine();

            while (!cad.equals("fin")) {
                out.write(cad);
                out.newLine();
                
                System.out.print("Escribe un texto de prueba: ");
                cad = sc.nextLine();
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }

    }

}
