/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciongenericos;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ComparaNombres implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
    
}
