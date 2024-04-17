/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 * @author Usuario
 */
public class Profesor {
    
    public String nombre, dni;
    public int nombrePermanencia;
    
    public Profesor(String nombre, String dni, int tiempoPermanencia){
        this.dni = dni;
        this.nombre = nombre;
        this.nombrePermanencia = nombrePermanencia;
    }
}
