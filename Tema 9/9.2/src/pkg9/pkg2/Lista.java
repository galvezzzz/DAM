/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg2;

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
    public void Desencolar() {

        tabla = Arrays.copyOf(tabla, tabla.length - 1);

    }

    void Mostrar() {

        System.out.println(Arrays.toString(tabla));
    }
}
