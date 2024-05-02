/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadenas[] = new String[0];
        
        cadenas = guardar("hola", cadenas);
        cadenas = guardar("qué tal?", cadenas);
        System.out.println(Arrays.toString(cadenas));
    }
    
    static <E> E[] guardar(E elem, E[] a){
        E aux[] = Arrays.copyOf(a, a.length + 1);
        aux[aux.length -1] = elem;
        
        return aux;
    }
}
