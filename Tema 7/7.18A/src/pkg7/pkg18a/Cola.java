/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg18a;

import java.util.Arrays;

/**
 *
 * @author bichi
 */
public class Cola {

    Integer tabla[];

    public Cola() {

        this.tabla = new Integer[0];
    }

    void Encolar(Integer objeto) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = objeto;

    }

    void Desencolar(Integer cantidad) {

        if (cantidad > tabla.length) {
            System.out.println("Intentas eliminar más de los que hay");
        } else {
            tabla = Arrays.copyOf(tabla, tabla.length - cantidad);
        }

    }

    void Mostrar() {

        System.out.println(Arrays.toString(tabla));
    }
}
