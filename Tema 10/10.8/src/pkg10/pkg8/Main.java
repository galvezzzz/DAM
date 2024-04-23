/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg8;

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

        String texto = "";
        String linea = "";
        

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un nombre para el fichero original: ");
        texto = sc.nextLine();
        
        String copia = "copia_de_" + texto;

        try (BufferedReader in = new BufferedReader(new FileReader(texto)); BufferedWriter out = new BufferedWriter(new FileWriter(copia))) {
            linea = in.readLine();

            while (linea != null) {
                out.write(copia);
                linea = in.readLine();
            }
            
            System.out.println(linea);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }

    }
}
