/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burbuja;

/**
 *
 * @author Usuario
 */
public class Burbuja {

    static void ordenacionBurbuja(int a[]) {

        int aux;

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }

        }
    }
    
    static void ordenacionBurbuja2(int a[]) {

        boolean ordenado = true;
        int i = 0, aux;
        
        while(i<a.length-1 && !ordenado){
            ordenado = true;
            
        }
        for (int j = 0; j < a.length-i-1; j++) {
            if (a[j]>a[j+1]) {
                ordenado = false;
                aux = a[j];
                a[j] = a[j+1];
                a[j+1] = aux;
            }
        }
        
    }

    public static void main(String[] args) {

        int t[] = {2, 5, 4, 3, 1};
    }

}
