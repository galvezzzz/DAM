/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Embarcaciones;

/**
 *
 * @author Usuario
 */
public class Submarino extends Barco{

    private static int numSubmarino = 0;
    private double periscopio;
    
    public Submarino(int longitud){
        super("Sub-" + numSubmarino, longitud);
        codigo += 1;
        super.longitud = longitud;
        periscopio = longitud / 10;
    }
    
    public double longitudPeriscopio(){
        
        periscopio = longitud / 10;
        return periscopio;
    }
    
    @Override
    public String toString(){
        return "Código: Sub-" + codigo + "\nLongitud: " + longitud + "\nLongitud periscopio: " + periscopio;
    }
}
