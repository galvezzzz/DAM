/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaherencia;

import veterinaria.veterinario;

/**
 *
 * @author Usuario
 */
public class TeoriaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona p = new persona("Pepe", (byte) 12, 175);
        persona p2 = new persona("Pepe", (byte) 12, 175);
        empleado e = new empleado("Rosa", (byte) 26, 160, 2000);
        veterinario v = new veterinario("Paco", "77777777");
        
        p.mostrar();
        
        System.out.println(p);
        
        System.out.println(p.equals(e));
        
        System.out.println(p.getClass().getSuperclass());
        
    }
    
}
