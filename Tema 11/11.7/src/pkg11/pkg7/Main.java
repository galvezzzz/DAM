/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11.pkg7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
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

        Scanner sc = new Scanner(System.in);
        int num;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {

            System.out.print("Introduce los números: ");
            num = sc.nextInt();

            while (num != -1) {
                out.writeInt(num);
                System.out.print("Introduce los números: ");
                num = sc.nextInt();       
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat"))) {

            while (in.available() > 0) {
                System.out.println("Bloques " + in.available());
                num = in.readInt();
                System.out.println(num);
            }

        } catch (EOFException ex) {
            System.out.println(ex);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
