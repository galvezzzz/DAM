/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaas;

import herenciaas.folder.Veterinario;

/**
 *
 * @author Usuario
 */
public class HerenciAAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Persona p = new Persona ("Pepe",(byte)45,172);
        Persona p2 = new Persona ("Pepe",(byte)45,172);
        Empleado e= new Empleado ("Rosa",(byte)43,"M",2000);
        Veterinario v=new Veterinario("Juan","100589333l");
        Animal a= new Animal();
        
        System.out.println(p.equals(p2));
        
    }
    
}
