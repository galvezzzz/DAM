import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String linea;
        int num;
        int[] lista = new int[5];
        int cont = 0;
        String basura;

        try (BufferedReader in = new BufferedReader(new FileReader("numeros1.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("numeros3.txt"))) {

            linea = in.readLine();

            while (linea != null) {
                Scanner sc = new Scanner(linea);

                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    lista[cont] = num;
                    cont++;
                }

                for (int i = 0; i < lista.length; i++) {
                    out.write(lista[i]);
                    out.newLine();
                }

                linea = in.readLine();
            }
            System.out.println("Archivo sobreescrito.");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}