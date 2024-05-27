/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> m = new TreeMap<>();
        String codigo;
        int opcion;
        Integer stock;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("fichero.dat"))) {
            m = (Map<String, Integer>) in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Dar de alta un producto");
            System.out.println("2. Dar de baja un producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce el código del producto: ");
                codigo = sc.next();
                if (!m.containsKey(codigo)) {
                    m.put(codigo, 0);
                    System.out.println("Producto introducido con éxito");
                } else {
                    System.out.println("El producto ya existe");
                }

            } else if (opcion == 2) {
                System.out.print("Introduce el código del producto a borrar: ");
                codigo = sc.next();
                if (m.containsKey(codigo)) {
                    m.remove(codigo);
                    System.out.println("Producto borrado con éxito");
                } else {
                    System.out.println("No existe ningún producto con ese código");
                }

            } else if (opcion == 3) {
                System.out.print("Introduce el código del producto: ");
                codigo = sc.next();

                if (!m.containsKey(codigo)) {
                    System.out.println("El producto no existe");
                } else {
                    System.out.print("Introduce el stock: ");
                    stock = sc.nextInt();

                    m.put(codigo, stock);
                    System.out.println("Stock actualizado con éxito");
                }
            } else if (opcion == 4) {
                System.out.println(m);
            }
            System.out.println("");

        } while (opcion != 5);
        System.out.println("Has salido del programa");

        

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fichero.dat"))) {
            out.writeObject(m);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
