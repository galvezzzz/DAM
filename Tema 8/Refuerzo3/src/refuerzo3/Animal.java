/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo3;

/**
 *
 * @author Usuario
 */
public class Animal {

    private String reproduccion;
    private String alimentacion;
    private double peso;
    private char sexo;

    public Animal(String reproduccion, String alimentacion, double peso, char sexo) {
        this.reproduccion = reproduccion;
        this.alimentacion = alimentacion;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getReproduccion(){
        return reproduccion;
    }
    
    public String getAlimentacion(){
        return alimentacion;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    @Override
    public String toString(){
        
        String cad;
        
        cad = "Tipo de reproducción: " + reproduccion + "\nTipo de alimentación: " + alimentacion + "\nTamaño: " + peso + "\nSexo: " + sexo;
        
        return cad;
    }

}
