package clasecollection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Alberto
 */
public class Cliente implements Comparable <Cliente>{
    
    String dni, nombre;
    LocalDate fechaNacimiento;

    public Cliente(String dni, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento= LocalDate.parse(fechaNacimiento , formato);
        
    }
    
    int edad(){
    
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
        
    }
   
    @Override
    public boolean equals(Object ob){
    
        return dni.equals(((Cliente)ob).dni);
    }
    
    @Override
    public int compareTo(Cliente otro){
    
        return dni.compareTo(otro.dni);
    }
    
    @Override
    public String toString(){
    
        return "Dni: " + dni + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
}
