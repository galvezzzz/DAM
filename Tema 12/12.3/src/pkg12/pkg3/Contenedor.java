package pkg12.pkg3;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 * @param <T>
 */
public class Contenedor<T extends Pila<T>> {
    
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
    
    void ordenar(){
        Arrays.sort(tabla);
    }

    @Override
    public String toString() {
        return Arrays.toString(tabla);
    }
    
    
}
