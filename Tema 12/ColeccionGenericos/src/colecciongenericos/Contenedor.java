package colecciongenericos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Contenedor<T> {
    
    private T objeto;
    
    public Contenedor(){}
    
    void guardar(T objeto){
        this.objeto = objeto;
    }
    
    T extraer(){
        T res;
        res = objeto;
        objeto = null;
        
        return res;
    }
}
