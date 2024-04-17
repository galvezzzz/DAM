/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fakesort;

/**
 *
 * @author Usuario
 */
public class insercion {

    static void ordenarInsercion(int a[]) {
        
        int j, aux;
        
        for (int i = 1; i < a.length; i++) {
            j = i;
            aux = a[i];
            
            while(j>0 && aux<a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
        
    }

    public static void main(String[] args) {

        int a[] = {2, 5, 4, 3, 1};

        ordenarInsercion(a);
    }

}
