import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;

        System.out.println("Introduce el nombre del archivo: ");
        cadena = sc.nextLine();

        if (cadena == null) {
            File prueba = new File("Prueba");

            try {
                prueba.createNewFile();
                System.out.println("Archivo " + prueba + " creado.");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(cadena);

        } else {
            File prueba = new File(cadena);

            if (!prueba.exists()) {
                try {
                    prueba.createNewFile();
                    System.out.println("Archivo " + prueba + " creado.");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}