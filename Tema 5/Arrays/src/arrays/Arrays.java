/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Usuario
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Empieza a contar desde 0.
        int edad[] = {1, 2, 3, 4};
        int edad2[];

        //Capacidad del arrays, aparecen en 0.
        edad2 = new int[10];

        final int FINAL = 3;

        for (int i = 0; i <= FINAL; i++) {
            System.out.println(edad[i]);
        }

        System.out.println("");
        //O también se puede hacer con.length

        for (int i = 0; i < edad.length; i++) {
            System.out.println(edad[i]);
        }
        //System.out.println(edad[3]);

        System.out.println("");

        //Asigno valores a las 10 casillas
        for (int i = 0; i < edad2.length; i++) {
            edad2[i] = 2 * i;
        }
        //Imprimo
        for (int i = 0; i < edad2.length; i++) {
            System.out.println(edad2[i]);
        }

    }

}
