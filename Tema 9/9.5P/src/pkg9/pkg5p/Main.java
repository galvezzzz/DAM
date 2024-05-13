/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.pkg5p;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Socio1 socios[] = {
            new Socio1("Gabriel", "12-12-2012"),
            new Socio1("María", "20-02-1999"),
            new Socio1("Antonio", "04-05-1974")
        };
        
        Arrays.sort(socios);
        System.out.println(Arrays.deepToString(socios));
    }

}
