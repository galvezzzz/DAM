/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg1;

/**
 *
 * @author Alberto Gálvez
 */
public class Ex1 {
    
    public static int[] arraycopy(int torigen[], int posorigen, int tdestino[], int posdestino, int length) {
        
        for (int i = 0; i < length; i++) {
            
            tdestino[posdestino] = torigen[posorigen];
            posdestino++;
            posorigen++;
        }
        
        return tdestino;
    }

    public static int[] borradores(int t[], int borrador) {

        int copia[] = new int[0], i = 0, lon = t.length;

        for (int j = 0; j < lon; j++) {

            if (t[j] != borrador) {

                copia = tcopyof(copia, copia.length + 1);
                copia[i] = t[j];
                i++;
            }

        }

        return copia;
    }

    public static int[] tcopyof(int original[], int length) {

        int copia[] = new int[length];

        if (length > original.length) {
            for (int i = 0; i < original.length; i++) {
                copia[i] = original[i];
            }
        } else {
            for (int i = 0; i < length; i++) {
                copia[i] = original[i];
            }
        }

        return copia;
    }

    public static int[] tsortmayor(int t[]) {

        int menores[] = new int[t.length], peque = 0, lc = 0, tamano = t.length;

        for (int i = 0; i < tamano; i++) {

            peque = 0;
            lc = 0;
            for (int j = 0; j < t.length; j++) {

                if (t[j] > peque) {
                    peque = t[j];
                    lc = j;
                }
            }

            menores[i] = peque;

            t[lc] = t[t.length - 1];
            t = tcopyof(t, t.length - 1);
        }

        return menores;
    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void tstring(int t[]) {

        System.out.print("[ ");

        for (int i : t) {
            System.out.print(i + ", ");
        }

        System.out.println("]");

    }

    static boolean esPrimo(int n) {

        boolean primo = true;
        int cont = 2;

        while (cont < n && primo) {

            if (n % cont == 0) {
                primo = false;
            } else {
                cont++;
            }
        }
        return primo;
    }

    public static void main(String[] args) {

        //Creamos la tabla
        int aleatorio = (int) (Math.random() * 16);

        while (aleatorio < 5) {
            aleatorio = (int) (Math.random() * 16);
        }

        int t[] = new int[aleatorio];

        int aleatorioImpar = (int) (Math.random() * 100 + 1);

        int tPrimos[] = new int[t.length];
        int tNoPrimos[] = new int[t.length];
        int tFusionada[] = new int[t.length];

        int cont = 0;

        for (int i = 0; i < t.length; i++) {
            aleatorioImpar = (int) (Math.random() * 100 + 1);
            t[i] = aleatorioImpar;

        }

        for (int i = 0; i < t.length; i++) {
            if (esPrimo(t[i])) {
                tPrimos[cont] = t[i];
                cont++;
            }
        }

        for (int i = 0; i < t.length; i++) {
            if (!esPrimo(t[i])) {
                tNoPrimos[cont] = t[i];
                cont++;
            }
        }
        
        System.out.print("Tabla primos: ");
        Sort(tPrimos);
        tstring(tPrimos);
        
        System.out.print("Tabla no primos: ");
        tstring(tsortmayor(tNoPrimos));

        for (int i = 0; i < t.length; i++) {
            if (tPrimos[i] != 0) {
                tFusionada[cont] = tPrimos[i];
                cont++;
            } else {
                cont = 0;
            }

        }
        
        System.out.print("Tabla fusionada: ");
        
        tstring(tFusionada);

    }

}
