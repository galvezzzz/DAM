/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movilidad;

/**
 *
 * @author Usuario
 */
public class vehiculos {

    protected String marca;
    protected String modelo;

    public enum Tipo {
        Terrestre, Acuático, Aéreo
    }
    
    public Tipo tipo;

    public vehiculos(String marca, String modelo, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
    }
}
