/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiasarrays;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class CopiasArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int a[], b[];
        int c[] = new int[5];
        
        //copyOf (Copia desde el principio hasta el número indicado).

        a = Arrays.copyOf(numeros, 15);
        System.out.println(Arrays.toString(a));
        
        //copyOfRange (Copia un rango de valores).
        
        b = Arrays.copyOfRange(a, 2, 5);
        System.out.println(Arrays.toString(b));

        //arraycopy (Copia en su propio array).
        
        System.arraycopy(numeros, 0, c, 0, 5);
        System.out.println(Arrays.toString(c));
        
    }
    
}
