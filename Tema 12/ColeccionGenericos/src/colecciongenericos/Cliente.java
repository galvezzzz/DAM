/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciongenericos;

/**
 *
 * @author Usuario
 */
public class Cliente implements Comparable<Cliente> {

    String dni;
    String nombre;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + " DNI: " + dni;
    }

}
