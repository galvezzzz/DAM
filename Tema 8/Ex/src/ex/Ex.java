/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex;

import Componentes.Boton;
import Componentes.Componente;
import Componentes.Imagen;

/**
 *
 * @author Usuario
 */
public class Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Componente c1 = new Componente(1, 23, 5);
        Componente c2 = new Componente(2, 23, 5);
        Boton b1 = new Boton(2,2,2);
        Imagen i1 = new Imagen(2,2,2);
        
        System.out.println(i1);

        System.out.println(b1);

        System.out.println(c1.equals(c2));
        System.out.println(c1);

    }

}
