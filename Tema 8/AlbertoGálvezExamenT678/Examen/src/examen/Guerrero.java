/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Usuario
 */
public class Guerrero extends Personaje {
    

    public Guerrero() {

        codigo = 20;

        if (codigo > 29) {
            codigo = 200;
        }

        super.setVida(15);

    }
    
    public String toString(){
        
        String cad = "Guerrero" + "\nCódigo: " + codigo + "\nVida: ";
        return cad;
        
    }
    
    

}
