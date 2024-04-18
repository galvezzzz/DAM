/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FileReader in = null;
        
        //Fichero abierto mal.

        try {
            in = new FileReader("texo.txt");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("No se puede cerrar el fichero.");
                }

            }

        }

    }

}
