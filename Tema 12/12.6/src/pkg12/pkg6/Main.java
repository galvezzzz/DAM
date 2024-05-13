package pkg12.pkg6;

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
        
        Integer num = 5;
        
        ArrayList<Integer> lista = new ArrayList<>();
              
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * 10 + 1));
        }
        
        System.out.println("Lista original: " + lista);
        
        lista.remove(Integer.valueOf(5));
        //lista.remove(num);
        
        System.out.println("Lista sin 5: " + lista);
    }
    
}
