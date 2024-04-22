import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        FileWriter fw;
        PrintWriter pw;

        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();

        sc.nextLine();

        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();

        try{
            File datos = new File("datos.txt");

            if (!datos.exists()){
                datos.createNewFile();
                System.out.println("Se ha creado el archivo: " + datos.getName());
            }

            fw = new FileWriter(datos);

            fw.write("Edad" + edad);
            fw.write("\nNombre: " + nombre);

        }catch (IOException ex){

        }finally{

        }



    }
}