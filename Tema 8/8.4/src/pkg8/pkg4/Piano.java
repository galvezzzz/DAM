/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.pkg4;

/**
 *
 * @author Usuario
 */
public class Piano extends Instrumento {
    
    public Piano(){
        super();
    }
    
    @Override
    public void Interpretar(){
        
        System.out.print("Melodía: ");
        
        for (octava o : melodia) {
            System.out.print(o + " ");
        }
        System.out.println("");
    }
}
