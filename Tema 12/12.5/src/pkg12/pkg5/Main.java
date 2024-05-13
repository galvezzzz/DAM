package pkg12.pkg5;

import java.util.ArrayList;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> ln = new ArrayList<>();
        int aleatorio;

        for (int i = 0; i < 20; i++) {
            aleatorio = (int) (Math.random() * 10 + 1);
            ln.add(aleatorio);
        }
        
        System.out.println("Tabla con repeticiones: " + ln);
        
        ArrayList<Integer> lr = new ArrayList<>();
        
        for (Integer i : ln) {
            if (!lr.contains(i)) {
                lr.add(i);
            }
        }
        
        System.out.println("Tabla sin repetidos: " + lr);
        
    }

}
