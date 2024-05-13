/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomparar;

import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class ComparaEdades implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int edad1 = ((Socio) o1).edad();
        int edad2 = ((Socio) o2).edad();
        
        return edad1 - edad2;
    }
    
}
