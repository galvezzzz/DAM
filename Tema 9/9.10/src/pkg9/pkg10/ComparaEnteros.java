/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg10;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Alberto
 */
public class ComparaEnteros implements Comparator {
    
    
    @Override
    public int compare(Object o1, Object o2) {
        return (int) o2 - (int) o1;
    }
    
}
