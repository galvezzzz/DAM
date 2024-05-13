/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.pkg16a;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Usuario
 */
public class Socio implements Comparable {
    
    String dni;
    String nombre;
    String fechaAlta;

    public Socio(String dni, String nombre, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }
    
     
    @Override
    public boolean equals(Object o) {
        
        if (!(o instanceof Socio)) {
            return false;
        }
        
        Socio persona = (Socio) o;
        boolean iguales = false;
        
        if (this.nombre.equals(persona.nombre) && this.edad == persona.edad) {
            iguales = true;
        }
        
        return iguales;
    }

//    @Override
//    public int compareTo(Object o) {
//        
//    }
    
    
