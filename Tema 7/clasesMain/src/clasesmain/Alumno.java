/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesmain;

/**
 *
 * @author Usuario
 */
public class Alumno {

    String nombre, telefono;
    int edad, curso;
    String dni;

    public Alumno(String nombre, int edad, int curso, String tlf, String dni) {
        this.curso = curso;
        this.edad = edad;
        this.nombre = nombre;
        telefono = tlf;
        this.dni = dni;
    }

    public Alumno(String dni) {
        this.dni = dni;
    }
    
    public Alumno(int edad){
        this.edad = edad;
    }

    public Alumno() {
        dni = "11111";
    }
 
}
