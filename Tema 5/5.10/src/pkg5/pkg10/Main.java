/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.pkg10;

import java.util.Arrays;

/**
 *
 * @author Alberto
 */
public class Main {

    static int[] eliminarMayores(int t[], int valor){
        
        int numeros[] = {23,12,24,11,15};
        int borrar = 23;
        int indiceBusqueda = Arrays.binarySearch(numeros, borrar);
        
        if(indiceBusqueda != -1){
            numeros[indiceBusqueda] = numeros[numeros.length];
            numeros = Arrays.copyOf(numeros, numeros.length-1);
            System.out.println(Arrays.toString(numeros));
            
        }else{
            System.out.println("No se ha encontrado el número.");
        }
        
        return numeros;
    }
    
    public static void main(String[] args) {
        
        int t[] = {23,12,24,11,15};
        int valor = 23;
        
        System.out.println(Arrays.toString(eliminarMayores(t,valor)));
        
        
    }
    
}
