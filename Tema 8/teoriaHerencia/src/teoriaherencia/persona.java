/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoriaherencia;

/**
 *
 * @author Usuario
 */
public class persona {
    
    protected String nombre;
    byte edad;
    double estatura;
    
    public persona(String nombre, byte edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
    
    @Override
    public String toString(){
        String cadena = "Nombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + estatura;
        return cadena;
    }
    
    @Override
    public boolean equals(Object o){
        
        persona p = (persona) o;
        boolean iguales = false;
        
        if (this.nombre.equals(p.nombre) && this.edad == p.edad) {
            iguales = true;
        }
        return iguales;
    }
    
    
}
