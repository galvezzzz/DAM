/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10.pkg7.bien;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Bien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedWriter out = null;
        FileWriter fw;
        String cadena = "En un lugar de la Mancha,";
        
        try{
            out = new BufferedWriter(new FileWriter("quijote.txt"));
            
            // De caracter en caracter
            for (int i = 0; i < cadena.length(); i++) {
                out.write(cadena.charAt(i));
            }
            
            out.newLine();
            
            // Línea completa
            cadena = "de cuyo nombre no quiero acordarme.";
            out.write(cadena);
            
        }catch(IOException ex){
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
