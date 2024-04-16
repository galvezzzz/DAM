/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Lista implements Cola {

    int tabla[] = new int[0];

    @Override
    public void Encolar(int objeto) {

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = objeto;
    }

    @Override
    public void Desencolar(int cantidad) {

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
