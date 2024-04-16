/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg5;

/**
 *
 * @author Usuario
 */
public class Gestor {

    public String nombre;
    private int telefono;
    int importeMax;

    //Constructores
    public Gestor(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        importeMax = 10000;
    }

    public Gestor(String nombre, int telefono, int importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMax = importeMax;
    }
    
    //Set
    void setImporteMax(int nuevoImporte) {
        this.importeMax = nuevoImporte;
    }
    
    void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    //Get para teléfono ya que no se puede cambiar
    int getTelefono() {
        return telefono;
    }
    
    String getNombre() {
        return nombre;
    }
    
    int getImporteMax() {
        return importeMax;
    }

    //Imprimir
    void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Importe máximo: " + importeMax);

    }
}
