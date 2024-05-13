/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caja;

/**
 *
 * @author Usuario
 */
public class CajaCarton extends Caja {

    public CajaCarton(int alto, int ancho, int fondo) {
        super(alto, ancho, fondo, Unidad.cm);

    }

    @Override
    double getVolumen() {
        
        double volumen;
        volumen = super.getVolumen();
        volumen *= 0.8;
        return volumen;
        
    }

    double getSuperficie() {

        double superficie;

        superficie = alto * ancho;

        return superficie;
    }
    
    @Override
    public String toString() {

        String frase = "Alto: " + alto + "\nAncho: " + ancho + "\nFondo: " + fondo + "\nUnidad: " + unidad;
        return frase;

    }

}
