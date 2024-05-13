/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader in = null; //Lee un bloque de datos
        //FileReader in = null; Lee carcater a caracter.
        String texto = null, linea;

        //in.readLine() devuelve null
        //in.read() devuelve -1
        
        try {
            in = new BufferedReader(new FileReader("Main.java"));
            linea = in.readLine();

            while (linea != null) { //Leemos mientras no se llegue al final del archivo
                texto += linea + "\n";
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

        System.out.println(texto);
    }

}
