/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysteoria;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class ArraysTeoria {

    static void imprimir(int a[]){
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int num[] = new int [10];
        Arrays.fill(num, 3, 7, 5);
        
        //esta estructura solo vale para PROCESAR
        for (int valor : num) { // Valor almacena num[i] en cada iteración
            System.out.print(valor + " ");
        }
    }
    
}
