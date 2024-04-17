/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package refuerzo17;

/**
 *
 * @author Usuario
 */
public class Refuerzo17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(decimal(1001));
    }
    static int decimal(int n){
    
        int cont=0,decimal=0,ultimoNum;
        
        while(n>0){
        
            ultimoNum= n%10;
            n/=10;
            if(ultimoNum!=0){
                decimal+= (int)Math.pow(2,cont);
            }
            cont++;
        }

        return decimal;
    }
}
