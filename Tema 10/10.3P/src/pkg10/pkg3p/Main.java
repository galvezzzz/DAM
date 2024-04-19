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
 * @author Alberto Gálvez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BufferedReader in = null;
        double sumaEdad = 0, edad, sumaAltura = 0, altura;
        int cont = 0;
        String linea = "", nombre = "";

        try {
            in = new BufferedReader(new FileReader("Jugadores.txt"));
            linea = in.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea).useLocale(Locale.US);
                
                nombre = sc.next(); // Realizamos la lectura del nombre (String) de los jugadores

                if (sc.hasNextInt()) { //Detectamos Int para edades
                    edad = sc.nextInt();
                    sumaEdad += edad;
                }

                if (sc.hasNextDouble()) { //Detectamos Double para altura
                    altura = sc.nextDouble();
                    sumaAltura += altura;
                }
                
                cont++;
                System.out.println(nombre);
                linea = in.readLine();
            }
            
            System.out.println(sumaEdad / cont);
            System.out.println(sumaAltura / cont);

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

    }

}
