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

    private static int numAcorazado = 1;
    private int canyon;
    
    public Acorazado(int longitud, int canyon){
        super("Ac-" + numAcorazado, longitud);
        numAcorazado++;
        this.canyon = canyon;

    }
    
    public void setCanyones(int canyon){
        this.canyon = canyon;
    }
    
    public int getCanyones(){
        return canyon;
    }
    
    @Override
    public String toString(){
        return "Código: " + codigo + "\nLongitud: " + longitud + "\nCañones: " + canyon;

    }
}
