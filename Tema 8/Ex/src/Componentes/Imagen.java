/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author Usuario
 */
public class Imagen extends Componente {

    String imagen = "I";
    int aleatorio = (int) (Math.random() * 30 + 31);

    public Imagen(int codigo, int ancho, int largo) {
        super(codigo, ancho, largo);
    }

    @Override
    public String toString() {
        return imagen + aleatorio;
    }

}
