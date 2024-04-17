/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg1;

/**
 *
 * @author bichi
 */
public class CuentaCorriente {
    
    double saldo;
    String nombre;
    String dni;
    
    CuentaCorriente(String nombre, String dni) {
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
    }

    boolean retirar(double cant) {
        boolean operacion;

        if (saldo >= cant) { //Sí hay saldo
            saldo -= cant;
            operacion = true;

        } else { //No hay saldo
            System.out.println("No hay saldo disponible");
            operacion = false;
        }
        return operacion;
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);

    }
}


