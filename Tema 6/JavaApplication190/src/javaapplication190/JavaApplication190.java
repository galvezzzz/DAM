/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication190;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication190 {

    public static void tstring(int t[]) {

        System.out.print("[ ");

        for (int i : t) {
            System.out.print(i + ", ");
        }

        System.out.println("]");

    }

    public static int[] arraycopy(int torigen[], int posorigen, int tdestino[], int posdestino, int length) {

        for (int i = 0; i < length; i++) {

            tdestino[posdestino] = torigen[posorigen];
            posdestino++;
            posorigen++;
        }

        return tdestino;
    }
    
    public static boolean tequals(int t1[], int t2[]) {
        
        boolean check = true;
        
        if (t1.length == t2.length) {
            
            for (int i = 0; i < t1.length; i++) {
                
                if (t1[i] != t2[i]) {
                    check = false;
                }
            }
        } else {
            check = false;
        }
        
        return check;
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
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t[] = {2, 5, 7, 2, 1, 4};
        
        borradores(t, 3);
        
        tstring(borradores(t,2));
        
        
        
    }

}
