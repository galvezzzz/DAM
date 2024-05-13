/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Embarcaciones;

/**
 *
 * @author Usuario
 */
public abstract class Barco {
    
    protected String codigo;
    protected int longitud;

    public Barco(String codigo, int longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    public void setLongitud(int lon){
        this.longitud = lon;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    @Override
    public boolean equals(Object o) {
        
        if (!(o instanceof Barco)) {
            return false;
        }
        
        Barco otraLongitud = (Barco) o;
        boolean iguales = false;
        
        if (this.longitud == otraLongitud.longitud) {
            iguales = true;
        }
        
        return iguales;
    }
    
    @Override
    public String toString(){
        return "Código: " + codigo + "\nLongitud: " + longitud;
    }
}
