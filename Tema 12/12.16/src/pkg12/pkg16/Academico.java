/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12.pkg16;

/**
 *
 * @author Usuario
 */
public class Academico implements Comparable<Academico>{

    private String nombre;
    private String anioIngreso;

    public Academico(String nombre, String anioIngreso) {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public int compareTo(Academico o) {
        return nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Letra{" + "Nombre: " + nombre + ", Año de ingreso: " + anioIngreso + "}";
    }
    
    

}
