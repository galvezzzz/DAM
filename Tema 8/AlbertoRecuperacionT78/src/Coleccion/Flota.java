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
    
    private int numBarcos;
    Barco coleccion[];
    String tipoBarco;

    public Flota(String codigo, int longitud) {
        super(codigo, longitud);

        int aleatorio = (int) (Math.random() * 11 + 10);
        coleccion = new Barco[aleatorio];
    }

    public int numeroElementos(){
        
        return coleccion.length;
    }
    
    public boolean insertarBarco(Barco b){
        
        int cont = 0;
        boolean insertado = false;
       
        if (coleccion[cont] == null) {

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

        Barco aux[] = Arrays.copyOf(coleccion, numBarcos);
        return coleccion;
    }
}
