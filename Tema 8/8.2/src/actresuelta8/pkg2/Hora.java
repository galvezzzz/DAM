/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actresuelta8.pkg2;

/**
 *
 * @author Usuario
 */
public class Hora {
    
    private int hora,minutos;
    
    public Hora(int hora, int minutos){
    
        this.hora=hora;
        this.minutos=minutos;
        
    }
    
    String hora(){
    
        String hr=hora+":"+minutos;
        System.out.println(hr);
        return hr;
    }
    
    void inc(){
    
        if(minutos > 58){
        
            minutos=0;
            hora++;
        }else{
        
            minutos++;
        }
        
        if(hora > 23){
        
            hora=0;
        }
        
    }
    
    boolean setminutos(int minutos){
    
        boolean posible=false;
        
        if(0<= minutos && minutos <60){
        
            this.minutos=minutos;
            posible=true;
        }
        
        System.out.println(posible);
        return posible;
    }
    
    boolean sethora(int hora){
    
        boolean posible=false;
        
        if(0 <= hora && hora < 24){
        
            this.hora=hora;
            posible=true;
        }
        
        System.out.println(posible);
        return posible;
    }
    
    @Override
    public String toString(){
    
        String result;
        result=hora + ":" + minutos;
        return result;
        
    }
    
}
