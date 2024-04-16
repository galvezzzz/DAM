/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg4;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public abstract class Instrumento {

    octava melodia[];

    public Instrumento() {
        melodia = new octava[0];
    }

    public enum octava {
        C, D, E, F, G, A, B
    }

    public void add(octava nota) {

        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    public abstract void Interpretar();
}
