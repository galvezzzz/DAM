/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

import teoriaherencia.persona;

/**
 *
 * @author Usuario
 */
public class veterinario extends persona{
    
    String dni;
    
    public veterinario(String nombre, String dni){
        
        super(nombre, (byte) 0 , 0);
        this.dni = dni;
    }
}
