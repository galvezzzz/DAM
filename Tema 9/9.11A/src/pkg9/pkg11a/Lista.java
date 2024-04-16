/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg11a;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Lista {

    int[] tabla;
    private int numElementos = 0;
    
    private int getElementos(){
        return numElementos;
    }
    
    int buscar(String cad){
        int posicion = 0;
        
        while(posicion < numElementos && cad.equals(tabla[posicion])){
            posicion++;
        }
        
        if (posicion == numElementos) {
            posicion= -1;
            
        }
        return posicion;
    }
    
//    protected boolean 

    public Lista() {
        this.tabla = new int[0];
    }

    public Lista(int tamanyo) {
        this.tabla = new int[tamanyo];
    }

    public void insertarElementos(int elemento) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = elemento;
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
    
    @Override
    public String toString() {

        return "Lista: " + Arrays.toString(tabla);

    }
    
    public void ordenar(){
        Arrays.sort(tabla, 0, 2);
    }
    
}
