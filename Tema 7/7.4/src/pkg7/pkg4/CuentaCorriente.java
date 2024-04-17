/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg4;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente {
    
    double saldo;
    String nombre;
    String dni;
    private static String Banco = "Banco de Málaga";
    
    static String getBanco(){
        return Banco;
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
