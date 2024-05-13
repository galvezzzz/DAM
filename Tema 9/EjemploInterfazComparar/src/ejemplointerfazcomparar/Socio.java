/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplointerfazcomparar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
public class Socio implements Comparable{
    
    int id;
    String nombre;
    LocalDate fechaNacimiento;
    
    public Socio(int id, String nombre, String fechaNacimiento){
    
        this.id=id;
        this.nombre=nombre;
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");//generar un formato para la fecha
        this.fechaNacimiento=LocalDate.parse(fechaNacimiento, f);
        
    }
    
    int edad(){
    
        return (int) fechaNacimiento.until(LocalDate.now(),ChronoUnit.YEARS);
    }
    
    @Override
    public int compareTo (Object o){
    
        int resultado;
        Socio otro= (Socio) o ;
        
        resultado = id - otro.id;
        
        return resultado;
        
        //también se puede en una línea: return id - ((otro).o).id;
    }
    
    @Override 
    public String toString(){
        
        return "\nId: "+ id + " Nombre: " + nombre +  " Edad: " + edad();
    }
}
