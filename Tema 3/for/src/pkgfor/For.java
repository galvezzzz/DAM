/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor;

/**
 *
 * @author Usuario
 */
public class For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Escribimos los impares del 1 al 10
        for (int i=1; i<=10; i=i+2){
                System.out.println(i);
        }        
            
        //Escribimos del -100 al 100
        for (int a=100; a>=1; a--){
                System.out.println(a);
                
        }
        for(int e=-100; e<=100; e = e+2){
            System.out.println(e);
        }
            
        //Cuadrado de los 10 primeros números
        for(int o=1; o<=10; o++){
            System.out.println(Math.pow(o, 2));
        }
    }
}
