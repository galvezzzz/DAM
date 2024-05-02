/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg1p;

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
        Integer cad1[] = {1,2,3,4,5};
        Integer cad2[] = {6,7,8,9,10};
        Integer aux[];
        aux = concatenar(cad1, cad2);
        System.out.println(Arrays.toString(aux));
    }
    
    static <E> E[] concatenar(E cad1[], E cad2[]){
        E cadFinal[] = Arrays.copyOf(cad1, cad1.length + cad2.length);
        System.arraycopy(cad2, 0, cadFinal, cad1.length, cad2.length);
        return cadFinal;
    }
    
}
