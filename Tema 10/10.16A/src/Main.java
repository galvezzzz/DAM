import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String linea;
        int opcion;
        String[] lista = new String[0];

        try(BufferedWriter out = new BufferedWriter(new FileWriter("libro.txt"))) {

            System.out.println("1. Añadir nombre");
            System.out.println("2. Mostrar nombres");
            System.out.println("3. Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            while (opcion != 3) {
                if (opcion == 1) {
                    System.out.print("Introduce tu nombre: ");
                    nombre = sc.next();
                    lista = Arrays.copyOf(lista, lista.length + 1);
                    lista[lista.length-1] = nombre;
                    out.write(nombre);
                    out.newLine();
                    System.out.println("Nombre introducido con éxito");
                }

                if (opcion == 2) {
                    System.out.println(Arrays.toString(lista));
                }
                System.out.println("1. Añadir nombre");
                System.out.println("2. Mostrar nombres");
                System.out.println("3. Salir");
                System.out.print("Introduce una opción: ");
                opcion = sc.nextInt();
            }
            System.out.println("El programa ha finalizado");

        }catch (IOException ex){
            System.out.println("Error al leer el archivo");
        }
    }
}