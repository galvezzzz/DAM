package pkg12.pkg11a;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Alberto
 * @since 02/05/24
 * @param <T>
 */
public class Contenedor<T>{
    
    private T tabla[];
    
    public Contenedor(T[] tabla){
        this.tabla = tabla;
    }
    
    void insertarPrincipio(T objeto){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = objeto;
    }
    
    void insertarFinal(T objeto){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = objeto;
    }
    
    T extraerPrincipio(){
        T aux = null;
        if(tabla.length > 0){
            aux = tabla[0];
            tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
        }
        return aux;
    }
    
    T extraerFinal(){
        T aux = null;
        if (tabla.length > 0) {
            aux = tabla[tabla.length - 1];
            tabla = Arrays.copyOf(tabla, tabla.length -1);
        }
        return aux;
    }
    
    void ordenar(Comparator<T> c){
        Arrays.sort(tabla, c);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }
    
    
}
