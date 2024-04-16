/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg5p;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class OrdenaSocios implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        ((Socio1) o1).nombre

    }
    
    //Comparar
    public int compareTo(Object o){
        int resultado;
        Socio1 otro = (Socio1) o;
        
        resultado = id - otro.id;
        
        return resultado;
    }
}
