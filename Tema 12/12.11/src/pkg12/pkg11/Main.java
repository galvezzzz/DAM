/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
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
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        String dni;
        String nombre;
        String fechaAlta;

        int opcion = 0;
        Set<Socio> s = new TreeSet<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            s = (Set<Socio>) in.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por DNI");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Introduce el DNI: ");
                dni = sc.next();

                System.out.println("Introduce el nombre: ");
                nombre = sc.next();
                
                System.out.println("Introduce la fecha de alta: ");
                fechaAlta = sc.next();
                
                Socio e = new Socio(dni, nombre, fechaAlta);
                s.add(e);
                System.out.println("¡Nuevo socio creado con éxito!");
            }
            
            System.out.println(s);

        } while (opcion != 6);
    }

}
