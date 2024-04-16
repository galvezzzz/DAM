/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coleccion;

import Embarcaciones.Acorazado;
import Embarcaciones.Barco;
import Embarcaciones.Submarino;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Flota extends Barco {
    
    int aleatorio = (int) (Math.random() * 11 + 10);
    Barco coleccion[] = new Barco[aleatorio];
    String tipoBarco;
    
    public Flota() {

    }
    
    public int numeroElementos(){
        
        return coleccion.length;
    }
    
    public boolean insertarBarco(Barco b){
        
        int cont = 0;
        boolean insertado = false;
       
        if (coleccion[cont] == null) {
            coleccion[cont] = new Acorazado();
            insertado = true;
            System.out.println("Se ha insertado el barco");
        }else{
            cont++;
            System.out.println("No se ha podido insertar el barco");
        }
        
        return insertado;
    }
    
    public boolean eliminarBarco(Barco b){
        int cont = 0;
        boolean eliminado = false;
        
        if (coleccion[cont] != null) {
            coleccion[cont] = null;
            eliminado = true;
            System.out.println("Se ha eliminado el barco");
        }else{
            cont++;
            System.out.println("No se ha podido eliminar el barco");
        }
        
        return eliminado;
    }
    
    public Barco[] arrayBarcos(){
        
        return coleccion;
    }
}
