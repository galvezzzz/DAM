/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg7;

import java.util.Arrays;
import static java.util.Arrays.copyOf;

/**
 *
 * @author Usuario
 */
public class Main {
    
    static boolean buscar(int num ,int a[]){
        
        int i = 0;
        while(i< a.length && a[i]!=num);
            i++;
        }
    
   
    
    static int[] sinRepetidos(int t[]) {

        int tabla[] = {1, 1, 1, 2, 2};
        int noRep[] = new int[0];
        
        for (int valor : t) {
            if(Arrays.binarySearch(tabla, valor)<0);
            tabla = copyOf(tabla, tabla.length +1);
 
        }
    }

    public static void main(String[] args) {

        int t[] = {1, 1, 1, 2, 2};

        System.out.println(sinRepetidos(t));
    }

}
