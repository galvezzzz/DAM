/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.pkg3;

/**
 *
 * @author bichi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuentaCorriente c;
        c = new CuentaCorriente("77427316R", "Alberto"); //DNI y nombre
        c.ingreso(1000);
        c.retirar(300);
        c.mostrar();
        System.out.println("Puedo sacar 700 euros: " + c.retirar(700));
        System.out.println("Puedo sacar 500 euros: " + c.retirar(500));

        c = new CuentaCorriente("77777777R", 2000);
        c.mostrar();

    }

}
