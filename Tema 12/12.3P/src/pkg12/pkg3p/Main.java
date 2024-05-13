package pkg12.pkg3p;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int aux;
        
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        
        System.out.println("Lista original: " + list);
        
        Iterator<Integer> it = list.iterator();
        
        for (;it.hasNext();) {
            aux = it.next();
            if (aux == 5) {
                it.remove();
            }
        }
        
        System.out.println("Lista sin 5: " + list);
        
        
    }
    
}
