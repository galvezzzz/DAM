/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author Usuario
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a, b, res;

        a = 5;
        b = 0;

        
        //Gestionamos la excepción en tiempo de ejecución
        try {
            res = a / b;
            System.out.println(res);
            
//        }catch (ArithmeticException ex){
//            //Se puede lanzar la excepción de tres maneras distintas
//            System.out.println("Error: División por cero");
//            System.out.println(ex);
//            System.out.println(ex.getMessage());
//            
//        }catch (ClassCastException ex){
//            System.out.println(ex.getMessage());
//            
//        }catch (Exception ex){
//            System.out.println(ex);

        }catch (ArithmeticException | ClassCastException ex){
            System.out.println(ex);
        }
        
        System.out.println("Fin del programa");

    }

}
