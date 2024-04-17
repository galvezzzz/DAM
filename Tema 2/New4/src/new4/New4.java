/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new4;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class New4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un número del 1 al 10: ");
        num = sc.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Minecraft");
                break;
            case 2:
                System.out.println("Grand Theft Auto V");
                break;
            case 3:
                System.out.println("Fortnite");
                break;
            case 4:
                System.out.println("Roblox");
                break;
            case 5:
                System.out.println("Call of Duty: Modern Warfare II/Warzone 2.0");
                break;
            case 6:
                System.out.println("The Sims 4");
                break;
            case 7:
                System.out.println("League of Legends");
                break;
            case 8:
                System.out.println("CSGO");
                break;
            case 9:
                System.out.println("Valorant");
                break;
            case 10:
                System.out.println("Grand Theft Auto: Online");
                break;
                
            default:
                System.out.println("El número introducido no es válido");
    }
    }
}
