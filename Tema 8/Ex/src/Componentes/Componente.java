/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Usuario
 */
public class Componente {

    int codigo, largo, ancho;

    public Componente(int codigo, int ancho, int largo) {

        if (ancho < 0 || largo < 0) {
            System.out.println("ERROR");
        } else {
            this.ancho = ancho;
            this.codigo = codigo;
            this.largo = largo;
        }

    }

    public int superficie() {

        int superficie;

        superficie = ancho * largo;
        return superficie;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Componente)) {
            return false;
        }

        Componente otroCod = (Componente) o;
        boolean iguales = false;

        if (this.codigo == otroCod.codigo) {
            iguales = true;
        }

        return iguales;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + "\nAncho: " + ancho + "\nLargo: " + largo;
    }
}
