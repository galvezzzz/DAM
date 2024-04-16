/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreriafunciones1.pkg14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibreriaFunciones114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //llama aquí a la función que desees
        
        
    }

    //1 Capiua
    static boolean esCapicua(int n) {

        int reverse;
        boolean capicua = false;

        reverse = voltea(n);

        if (reverse == n) {
            capicua = true;
        }

        return capicua;
    }

    //2 esPrimo
    static boolean esPrimo(int n) {

        boolean primo = true;
        int cont = 2;

        while (cont < n && primo) {

            if (n % cont == 0) {
                primo = false;
            } else {
                cont++;
            }
        }
        return primo;
    }

    //3 siguientePrimo
    static int sigPrimo(int n) {

        int sigPri;
        boolean primo=false;
        
        sigPri=n+1;
        while(primo){
        
            for (int i = 0; i < sigPri; i++) {
                
                if(sigPri % i !=0) {
                    primo=true;
                }
            }
        }

        return sigPri;
    }

    // 4 potencia
    static int potencia(int n, int a) {

        int potencia;

        potencia = (int) Math.pow(n, a);

        return potencia;
    }

    // 5 Digitos
    static int digitos(int n) {

        int cont = 0;
        while (n > 0) {

            n /= 10;
            cont++;
        }

        return cont;
    }

    //6 voltea
    static int voltea(int n) {

        int revers = 0;

        while (n > 0) {

            revers = (revers * 10) + (n % 10);
            n /= 10;
        }

        return revers;
    }

    // 7 digitoN
    static int digitoN(int n) {

        int posicion = 0, rever;

        voltea(n);

        return posicion;
    }

    // 8 posicionDeDigito
    static int posiscionDeDigito(int n) {

        int posicion = 0, digito, ultimoDigi, reverse;
        boolean check = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el dígito que buscas: ");
        digito = sc.nextInt();

        reverse = voltea(n);

        while (check) {

            ultimoDigi = reverse;
            ultimoDigi %= 10;
            reverse /= 10;
            posicion++;

            if (ultimoDigi == digito) {

                check = true;
            } else {

                posicion = -1;
            }

        }

        return posicion;
    }

    // 9 quitarPorDetras
    static int quitarPorDetras(int n) {

        int cont = 0, cantDig;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de digitos que desea retirar del número: ");
        cantDig = sc.nextInt();

        while (check) {

            n /= 10;
            cont++;

            if (cont == cantDig) {
                check = false;
            }
        }
        return n;
    }

    // 10 quitarPorDelante
    static int quitarPorDelante(int n) {

        int reverse, nuevoNum;

        reverse = voltea(n);
        nuevoNum = quitarPorDetras(reverse);
        nuevoNum = voltea(nuevoNum);

        return nuevoNum;
    }

    // 11 pegarPorDetras
    static void pegarPorDetras(int n) {

        int numAdicional;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número que deseas adicionar: ");
        numAdicional = sc.nextInt();

        System.out.println(n + "" + numAdicional);
    }

    // 12 pegaPorDelante
    static void pegarPorDelante(int n) {

        int numAdicional;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número que deseas adicionar: ");
        numAdicional = sc.nextInt();

        System.out.println(numAdicional + "" + n);
    }

    // 14 juntaNumeros
    static void juntaNumeros(int n) {

        int parteNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la otra parte del número: ");
        parteNum = sc.nextInt();

        System.out.println(n + "" + parteNum);
    }
}
