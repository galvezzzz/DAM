/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package albertorecuperaciont78;

import Coleccion.Flota;
import Embarcaciones.Acorazado;
import Embarcaciones.Submarino;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlbertoRecuperacionT78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int seleccion;
        String tipoBarco;

        Flota f = new Flota();

        //Menú
        System.out.println("1. Insertar barco");
        System.out.println("2. Eliminar barco");
        System.out.println("3. Mostrar flota");
        System.out.println("4. Salir");

        System.out.print("Introduce una opción: ");
        seleccion = sc.nextInt();

        switch (seleccion) {
            case 1 -> {
                System.out.println("Acorazado - a | Submarino - s: ");
                tipoBarco = sc.nextLine();

                f.insertarBarco(f);
            }

            case 2 ->
                f.eliminarBarco(f);

            case 3 ->
                System.out.println(Arrays.toString(f.arrayBarcos()));

            default -> {
            }
        }

        while (seleccion != 4) {
            System.out.println("1. Insertar barco");
            System.out.println("2. Eliminar barco");
            System.out.println("3. Mostrar flota");
            System.out.println("4. Salir");

            System.out.print("Introduce una opción: ");
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1 -> {
                    System.out.println("Acorazado - a | Submarino - s: ");
                    tipoBarco = sc.next();
                    
                    f.insertarBarco(f);
                }

                case 2 ->
                    f.eliminarBarco(f);

                case 3 ->
                    System.out.println(Arrays.toString(f.arrayBarcos()));

                default -> {
                }
            }
        }

    }

}
