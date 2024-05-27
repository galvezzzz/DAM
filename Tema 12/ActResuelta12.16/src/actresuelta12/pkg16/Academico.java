/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actresuelta12.pkg16;

/**
 *
 * @author Usuario
 */
public class Academico implements Comparable<Academico>{

    String nombre;
    int anioIngreso;

    public Academico(String nombre, int anioIngreso) {
        
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }
    
    
    @Override
    public int compareTo(Academico o) {

        return nombre.compareTo(o.nombre);
    }
    
    @Override
    public String toString(){
    
        return "Nombre: " + nombre + "\nAño de Ingreso: " + anioIngreso;
    }

    
}
