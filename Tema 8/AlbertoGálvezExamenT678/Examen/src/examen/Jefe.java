/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Usuario
 */
public class Jefe extends Personaje{
    
    int vidaExtra;
    
    public Jefe(){
        
        codigo = 10;

        if (codigo > 19) {
            codigo = 100;
        }
        
        super.setVida(20);
        vidaExtra = vidaExtra / codigo;
    }
    
   
    
}
