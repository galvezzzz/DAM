import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String linea = "";
        int contPalabra = 0;
        int contLineas = 0;

        try (BufferedReader in = new BufferedReader(new FileReader("carta.txt"))){
            linea = in.readLine();

            while(linea != null){
                contLineas++;
                System.out.println(linea);
                linea = in.readLine();
            }

            System.out.println("Número de líneas: " + contLineas);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}