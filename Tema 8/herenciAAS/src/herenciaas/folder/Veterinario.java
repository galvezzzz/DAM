/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaas.folder;

import herenciaas.Persona;

/**
 *
 * @author Usuario
 */

public class Veterinario extends Persona{
    
    String dni;
    
    public Veterinario(String nombre, String dni){
    
       super(nombre, (byte)0, 0);
       this.dni=dni;
       
    }
    
    @Override
    public void mostrar(){
    
        System.out.println("Nombre: " + super.nombre);
        System.out.println("DNI: " + dni);
    }
}
