import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = null;
        String cadena;

        try {
            br = new BufferedReader(new FileReader("Cervantes.txt"));
            cadena = br.readLine();

            while (cadena != null) {
                System.out.println(cadena);
                cadena = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Cerrado.");
            }
        }
    }
}