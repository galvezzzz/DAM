/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocomparar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Socio{

    int id;
    String nombre;
    LocalDate fechaNacimiento;

    //Constructor
    public Socio(int id, String nombre, String fecha) {

        this.id = id;
        this.nombre = nombre;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
    
    //Comparar
    public int compareTo(Object o){
        int resultado;
        Socio otro = (Socio) o;
        
        resultado = id - otro.id;
        
        return resultado;
    }

    //Mostrar
    @Override
    public String toString() {
        String cadena = "\nId: " + id + " Nombre: " + nombre + " Edad: " + edad();
        return cadena;
    }


    
    
    
}
