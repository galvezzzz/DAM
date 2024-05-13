/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.pkg15a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alberto
 */
public class sinRepetidos {

    public static <T> List eliminarRepetidos(List<T> lista) {

        List<T> eliminar = new ArrayList<>();

        for (T elemento : lista) {
            if (!eliminar.contains(elemento)) {
                eliminar.add(elemento);
            }

        }
        return eliminar;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(i);
            a.add(i + 1);
        }

        System.out.println("Tabla con repetidos: " + a);
        System.out.println("Tabla sin repetidos: " + eliminarRepetidos(a));
        
        
       

    }

}
