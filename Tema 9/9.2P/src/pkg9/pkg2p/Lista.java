/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg2p;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Lista implements ColaDoble {

    int tabla[] = new int[0];

    @Override
    public Integer desencolarPrincipio() {

        return eliminar(0);
    }

    @Override
    public void encolar(int objeto) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = objeto;
    }

    @Override
    public void desencolar(int cantidad) {

        if (cantidad > tabla.length) {
            System.out.println("Intentas eliminar más de los que hay");
        } else {
            tabla = Arrays.copyOf(tabla, tabla.length - cantidad);
        }

    }

    @Override
    public void encolarCabeza(Integer objeto) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = objeto;

    }

    public Integer eliminar(int indice) {
        Integer num = null;

        if (indice >= 0 && indice < tabla.length) {
            num = tabla[indice];

            for (int i = indice; i < tabla.length - 1; i++) {
                tabla[i] = tabla[i + 1];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return num;

    }

    void Mostrar() {
        System.out.println(Arrays.toString(tabla));
    }

}
