/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg2;

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

        FileReader in = null;
        String texto = "";
        int c;

        try {
            in = new FileReader("Main.java");
            c = in.read();

            while (c != -1) {
                texto += (char) c;
                c = in.read();
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
