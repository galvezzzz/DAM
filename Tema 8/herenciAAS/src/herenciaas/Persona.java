/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaas;

/**
 *
 * @author Usuario
 */
public class Persona {

    protected String nombre;
    byte edad;
    double estatura;

    public Persona(String nombre, byte edad, double estatura) {

        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;

    }

    public void mostrar() {

        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + estatura);
    }

    @Override
    public String toString() {

        String cadena = "Nombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + estatura;

        return cadena;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Persona)) {
            return false;
        }

        Persona persona = (Persona) o;
        boolean iguales = false;

        if (this.nombre.equals(persona.nombre) && this.edad == persona.edad) {
            iguales = true;
        }

        return iguales;
    }
}
