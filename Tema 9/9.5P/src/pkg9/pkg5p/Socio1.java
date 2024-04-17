/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.pkg5p;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

/**
 *
 * @author Usuario
 */
public class Socio1{
    
    String nombre;
    LocalDate fechaNacimiento;

    public Socio1(String nombre, String fecha) {
        this.nombre = nombre;

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fecha, f);
    }
    

    @Override
    public String toString() {
        String cadena = " Nombre: " + nombre + "Fecha nacimiento: " + fechaNacimiento;
        return cadena;
    }


    
    
    
}
