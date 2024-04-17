/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg10;

/**
 *
 * @author Usuario
 */
public class Personal {

    String nombre;
    String DNI;
    double sueldo;
    String rango;
    int telefono;
    String especialidad;
    String fecha;
    
    //Hay que hacer cada uno en un paquete de manera que todos sean clases

    void Maquinistas(String nombre, String DNI, double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    
    void Mecanicos(String nombre, int telefono, String especialidad){
        
    }
    
    void Jefes(String nombre, int DNI, String fecha){
        
    }

}
