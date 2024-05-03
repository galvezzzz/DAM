package pkg12.pkg12a;

import java.util.Comparator;

/**
 *
 * @author Alberto
 * @since 03/05/24
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        int aleatorio;

        for (int i = 0; i < 30; i++) {
            aleatorio = (int) ((Math.random() * 10) + 1);
            c.insertarPrincipio(aleatorio);
        }

        System.out.println("Tabla desordenada: " + c);
        
        Comparator<Integer> orden = Comparator.naturalOrder();
        c.ordenar(orden.reversed());

        System.out.println("Tabla ordenada: " + c);

        
    }

}
