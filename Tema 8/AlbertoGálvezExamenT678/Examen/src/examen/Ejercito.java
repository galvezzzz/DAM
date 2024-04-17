/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercito {

    Personaje p;
    Personaje ejercito[];
    Jefe j;
    Guerrero g;

    public Ejercito() {

        int longitud;

        longitud = (int) (Math.random() * 4 + 3);
        ejercito = new Personaje[longitud];

        for (int i = 0; i < longitud - 1; i++) {
            ejercito[i] = new Guerrero();
        }
        
        ejercito[ejercito.length - 1] = new Jefe();
        

    }

    @Override
    public String toString() {

        String cad = "";

        for (int i = 0; i < ejercito.length; i++) {
            cad = Personaje.class.getSimpleName();
        }
        return Arrays.toString(ejercito);
    }

    

}
