package pkg12.pkg4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> tabla = new ArrayList<>();
        
        int num;

        System.out.print("Introduce números (para terminar introduce -1): ");
        num = sc.nextInt();

        while (num != -1) {
            tabla.add(num);

            System.out.print("Introduce números (para terminar introduce -1): ");
            num = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("Tabla original: " + tabla);
        
        for (Integer i : tabla) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        for (Iterator<Integer> it = tabla.iterator(); it.hasNext();) {
            num = it.next();
            if (num % 3 == 0) {
                it.remove();
            }
        }
        System.out.println("Sin múltiplos de 3: " + tabla);

    }

}
