package pkg12.pkg4p;

import java.util.ArrayList;
import java.util.Collection;
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
        Collection<Double> p = new ArrayList<>();
        Collection<Double> n = new ArrayList<>();
        double num, total = 0, aux;

        //Creación de la lista
        System.out.print("Introduce números reales (para terminar introduce 0): ");
        num = sc.nextDouble();

        while (num != 0) {

            if (num >= 0) {
                p.add(num);
            } else {
                n.add(num);
            }

            System.out.print("Introduce números reales (para terminar introduce 0): ");
            num = sc.nextDouble();
        }
        System.out.println("Tabla positiva: " + p);
        System.out.println("Tabla negativa: " + n);
        
        //Calculo de la suma
        Iterator<Double> itP = p.iterator();
        Iterator<Double> itN = n.iterator();
        
        for (;itP.hasNext();) {
            total += itP.next();
        }
        System.out.println("Suma positivos: " + total);
        
        total = 0;
        for (;itN.hasNext();) {
            total += itN.next();
        }
        System.out.println("Suma negativos: " + total);
        
        //Eliminar
        itP = p.iterator();
        for (;itP.hasNext();) {
            aux = itP.next();
            if (aux > 10) {
                itP.remove();
            }
        }
        System.out.println("Tabla sin números mayores que 10: " + p);
        
        itN = n.iterator();
        for (;itN.hasNext();) {
            aux = itN.next();
            if (aux < -10) {
                itN.remove();
            }
        }
        System.out.println("Tabla sin números menores que -10: " + n);
        
    }

}
