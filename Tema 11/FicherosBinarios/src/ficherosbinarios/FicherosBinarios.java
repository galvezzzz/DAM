package ficherosbinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Usuario
 */
public class FicherosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos.txt"))) {
            out.writeInt(1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
