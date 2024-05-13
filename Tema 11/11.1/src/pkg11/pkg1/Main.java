/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tabla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Escribir
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.txt"))) {

            for (int i = 0; i < tabla.length; i++) {
                out.writeInt(tabla[i]);
            }

            out.writeObject(tabla);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int aux[] = new int[10];

        //Leer 
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.txt"))) {
            for (int q = 0; q < 10; q++) {
                System.out.println(in.readInt());
            }

            aux = (int[]) in.readObject();
            System.out.println(Arrays.toString(aux));
            
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println(ex.getMessage());
            
        }
    }

}
