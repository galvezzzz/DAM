
import java.util.Scanner;

/**
 *
 * @author Alberto
 * @since 02/05/24
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num, cont = 0;
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        num = sc.nextInt();

        while (num != -1) {
            c.encolar(num);
            cont++;

            System.out.print("Introduce un número: ");
            num = sc.nextInt();
        }

        System.out.println(c);

        for (int i = 0; i < cont; i++) {
            c.desencolar();
            System.out.println(c);
        }

        System.out.println(c);
    }
}
