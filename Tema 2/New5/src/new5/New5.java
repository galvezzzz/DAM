/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package new5;

import java.util.Scanner;

/**
 *
 * @author bichi
 */
public class New5 {

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
                System.out.println("El juego más jugado en 2023 es Minecraft");
                break;
            case 2:
                System.out.println("El segundo juego más jugado en 2023 es Grand Theft Auto V");
                break;
            case 3:
                System.out.println("El tercer juego más jugado en 2023 es Fortnite");
                break;
            case 4:
                System.out.println("El cuarto juego más jugado en 2023 es Roblox");
                break;
            case 5:
                System.out.println("El quinto juego más jugado en 2023 es Call of Duty: Modern Warfare II/Warzone 2.0");
                break;
            case 6:
                System.out.println("El sexto juego más jugado en 2023 es The Sims 4");
                break;
            case 7:
                System.out.println("El séptimo juego más jugado en 2023 es League of Legends");
                break;
            case 8:
                System.out.println("El octavo juego más jugado en 2023 es CSGO");
                break;
            case 9:
                System.out.println("El noveno juego más jugado en 2023 es Valorant");
                break;
            case 10:
                System.out.println("El décimo juego más jugado en 2023 es Grand Theft Auto: Online");
                break;
            default:
                System.out.println("El número introducido no es válido");
    }
    }
}
