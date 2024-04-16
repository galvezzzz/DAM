/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2;

/**
 *
 * @author Usuario
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 1;
        
        switch (num){
            case 1 -> {
                System.out.println("Uno");
            }
            
            case 2 -> {
                System.out.println("Dos");
            }
           
          
        }
        
        int n = 1, res;
        
        res = switch(num){
            case 1 -> {
                yield num*3;
            }
            default ->{
                yield 0;
            }
        };
        System.out.println("res: " + res);
        
        System.out.println("Fin del programa");
    }
    
}
