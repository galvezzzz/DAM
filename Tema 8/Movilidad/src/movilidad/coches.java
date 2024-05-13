/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movilidad;

/**
 *
 * @author Usuario
 */
public class coches extends vehiculos {

    byte numPuertas;
    String color;
    double potencia;

    public coches(String marca, String modelo, Tipo tipo, byte numPuertas, String color, double potencia) {

        super(marca, modelo, tipo);

        this.numPuertas = numPuertas;
        this.potencia = potencia;
        this.color = color;

    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia);
    }

}
