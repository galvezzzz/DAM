/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Embarcaciones;

/**
 *
 * @author Usuario
 */
public class Acorazado extends Barco{
    
    int canyon;
    
    public Acorazado(){
        codigo += 1;
    }
    
    public void setCanyones(int canyon){
        this.canyon = canyon;
    }
    
    public int getCanyones(){
        return canyon;
    }
    
    @Override
    public String toString(){
        return "Código: Ac-" + codigo + "\nLongitud: " + longitud + "\nCañones: " + canyon;
    }
}
