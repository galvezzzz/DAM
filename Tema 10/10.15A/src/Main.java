import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String linea = "";
        int num;
        int mayor, menor;
        int[] lista = new int[0];

        try(BufferedReader in = new BufferedReader(new FileReader("numeros.txt"))){
        linea = in.readLine();

            while(linea != null){
                Scanner sc = new Scanner(linea);

                if (sc.hasNextInt()){
                    num = sc.nextInt();
                    lista = Arrays.copyOf(lista, lista.length+1);
                    lista[lista.length-1] = num;
                }

                Arrays.sort(lista);
                linea = in.readLine();
            }
            mayor = lista[lista.length - 1];
            menor = lista[0];
            System.out.println("El mayor será: " + mayor);
            System.out.println("El menor será: " + menor);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}