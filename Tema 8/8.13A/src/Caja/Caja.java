/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caja;

/**
 *
 * @author Usuario
 */
public class Caja {

    double alto;
    double ancho;
    double fondo;
    String etiqueta;
    public Unidad unidad;

    double getVolumen() {
        double cubico;

        if (unidad == unidad.m) {
            cubico = alto * ancho * fondo;
            
        } else {
            alto = alto / 100;
            ancho = ancho / 100;
            fondo = fondo / 100;
            cubico = alto * ancho * fondo;
        }

        return cubico;
    }

    public Caja(int alto, int ancho, int fondo, Unidad u) {
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.unidad = u;
    }

    void setEtiqueta(String etiqueta) {

        if (etiqueta.length() > 30) {
            System.out.println("Etiqueta demasiado larga");
        } else {
            this.etiqueta = etiqueta;
        }

    }

    @Override
    public String toString() {

        String frase = "Alto: " + alto + "\nAncho: " + ancho + "\nFondo: " + fondo + "\nUnidad: " + unidad + "\nEtiqueta: " + etiqueta;
        return frase;

    }

}
