/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actresuelta8.pkg2;

/**
 *
 * @author Usuario
 */
public class ActResuelta82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HoraExacta he = new HoraExacta(23, 59, 50);
        he.setsegundos(59);
        he.inc();
        System.out.println(he);

    }

}
