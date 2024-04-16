/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Usuario
 */
public class Boton extends Componente{

    String boton = "B";
    int aleatorio = (int) (Math.random() * 30 + 1);

    public Boton(int codigo, int ancho, int largo) {
        super(codigo, ancho, largo);
    }

    @Override
    public String toString() {
        return boton + aleatorio;
    }
}
