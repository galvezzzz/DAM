import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String edad;

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        edad = sc.nextLine();

        sc.nextLine();

        try(BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt"))){
            out.write(nombre);
            out.write(" ");
            out.write(edad);
            out.newLine();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}