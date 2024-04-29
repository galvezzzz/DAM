/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.pkg2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escribir
        String poema = """
                       Con diez cañones por banda,
                       viento en popa, a toda vela,
                       no corta el mar, sino vuela,
                       un velero bergantín
                       """;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("poema.dat"))) {

            out.writeObject(poema);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        //Leer
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("poema.dat"))) {
            poema = (String) in.readObject();
            System.out.println(poema);
            
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }
    
}
