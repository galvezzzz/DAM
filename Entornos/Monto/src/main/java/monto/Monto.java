/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package monto;

/**
 *
 * @author bichi
 */
public class Monto {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String ingreso(int cantidad) {
        String sRespuesta;

        if (cantidad >= 1 && cantidad <= 1000) {
            sRespuesta = "Valor introducido correcto";
        } else if (cantidad < 1) {
            sRespuesta = "Error: La cantidad introducida es menor de 1";
        } else {
            sRespuesta = "Error: La cantidad introducida es > 1000";
        }

        return sRespuesta;

    }
}
