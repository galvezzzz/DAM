/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones2;

/**
 *
 * @author Usuario
 */
public class NewMain {

    static int dividir(int a, int b) throws Exception {
        return a / b;
    }

    public static void main(String[] args) {

        int a, b, res;

        try {
            System.out.println(dividir(5, 0));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Cerrando recursos");
        }

        System.out.println("Fin del programa");

    }

}
