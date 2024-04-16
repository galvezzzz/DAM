/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package monto;

/**
 *
 * @author juana
 */
public class monto {

    
    public String ingreso (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1 && cantidad <=1000) {
                sRespuesta = "Valor introducido correcto";
            } else if (cantidad < 1) {
                sRespuesta = "Error: La cantidad introducida es menor de 1";
            } else {
                sRespuesta= "Error: La cantidad introducida es > 1000";
            }
        
        return sRespuesta;
    }
}
