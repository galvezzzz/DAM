/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg5;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente {

    double saldo;
    String nombre;
    String dni;
    private String Banco = "Banco de Málaga";

    void setBanco(String nuevoBanco) {
        this.Banco = nuevoBanco;
    }

    String getBanco() {
        return Banco;
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

    //Constructores
    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        nombre = "";
    }

    CuentaCorriente(double saldo, String nombre, String dni) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.dni = dni;
    }
    
}
