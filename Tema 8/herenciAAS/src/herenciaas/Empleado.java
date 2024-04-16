/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaas;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona{
    
    double sueldo;
    String estatura;
    
    public Empleado(String nombre, byte edad, String estatura, double sueldo){
    
        super(nombre,edad,0);
        this.sueldo=sueldo;
        this.estatura=estatura;
        
    }
    
    @Override
    public void mostrar(){
    
        System.out.println("Nombre: "+ super.nombre);
        System.out.println("Edad: " + super.edad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Estatura: "+ estatura);
        
    }
}
