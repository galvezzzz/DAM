/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg5p;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    static void desordenada() {

        int tabla[] = {1, 2, 3, 4, 6, 7};
        int numeroNuevo = 5;
        int indiceDeInsercion = Arrays.binarySearch(tabla, numeroNuevo);

        if (indiceDeInsercion < 0) {
            indiceDeInsercion = -indiceDeInsercion - 1;
        }

        int tablaCopia[] = new int[tabla.length + 1];
        System.arraycopy(tabla, 0, tablaCopia, 0, indiceDeInsercion);
        
        tablaCopia[indiceDeInsercion] = numeroNuevo;
        
        System.arraycopy(tabla, 0, tablaCopia, indiceDeInsercion, 0);
       
        
        System.out.println(Arrays.toString(tablaCopia));
    }

    public static void main(String[] args) {
        
        desordenada();
    }
    
    public static int tsearch(int t[], int clave) {
        
        int pos = -1, num = 0;
        boolean check = true;
        
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                pos = i;
            }
        }
        
        if (pos == -1) {
            if (t[t.length - 1] < clave) {
                pos = t.length;
                
            } else {
                while (check && num < t.length) {
                    if (t[num] > clave) {
                        pos = num + 1;
                        check = false;
                    }
                    num++;
                }
                
            }
            pos = -pos;
        }
        return pos;
    }

}
