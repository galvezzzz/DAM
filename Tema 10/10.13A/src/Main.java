
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author Alberto Gálvez
 */
public class Main {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {

        String linea;
        int num;
        int[] lista = new int[0];
        int cont = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("numeros1.txt")); BufferedReader in2 = new BufferedReader(new FileReader("numeros2.txt")); BufferedWriter out = new BufferedWriter(new FileWriter("numeros3.txt")); BufferedReader in3 = new BufferedReader(new FileReader("numeros3.txt"))) {

            // Leemos y almacenamos el primer archivo de números
            linea = in.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea);

                while (sc.hasNextInt()) {
                    num = sc.nextInt();
                    lista = Arrays.copyOf(lista, lista.length + 1);
                    lista[lista.length - 1] = num;

                }

                linea = in.readLine();
            }
            
            // Leemos y almacenamos el segundo archivo de números
            cont = 0;
            linea = in2.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea);

                while (sc.hasNextInt()) {
                    num = sc.nextInt();
                    lista = Arrays.copyOf(lista, lista.length + 1);
                    lista[lista.length - 1] = num;
                }

                linea = in2.readLine();
            }

            // Ordenamos el array
            Arrays.sort(lista);

            // Escribimos el array en el fichero
            while (cont < lista.length) {
                out.write(Integer.toString(lista[cont++]));
                out.newLine();
            }

            System.out.println("Archivo sobreescrito.");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
