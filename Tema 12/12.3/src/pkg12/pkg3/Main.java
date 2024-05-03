package pkg12.pkg3;

/**
 *
 * @author Alberto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contenedor<Integer> c = new Contenedor<>(new Integer[0]);
        
        c.apilar(1);
        c.apilar(2);
        c.apilar(3);
        
        c.desapilar();
        
        System.out.println(c);
    }
    
}
