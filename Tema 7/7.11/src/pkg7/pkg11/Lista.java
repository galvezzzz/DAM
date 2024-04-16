/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg11;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Lista {

    Integer tabla[];
    int pos;

    public Lista() {
        tabla = new Integer[0];
    }

    void elementosInsertados() {
        System.out.println("El número de elementos insertados son: " + (tabla.length));
    }

    void insertarFinal(Integer copia) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = copia;

    }

    void insertarInicio(Integer copia) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = copia;
    }

    void insertar(Integer copia, int pos) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, pos, tabla, pos + 1, tabla.length - pos - 1);
        tabla[pos] = copia;
    }
    
    void mostrarArrays(){
        System.out.println(Arrays.toString(tabla));
    }
    
    void finalLista(Integer copia){
        
    }
}
