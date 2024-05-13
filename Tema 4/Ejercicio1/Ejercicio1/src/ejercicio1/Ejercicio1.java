package ejercicio1;

public class Ejercicio1 {

    //Función para calculo del factorial.
    static int factorial(int n) {

        int fact = n;

        for (int i = n - 1; i > 0; i--) {
            fact *= i;
        }

        return fact;
    }

    //Función para calculo del exponencial (e).
    static double exponencial(int x, int n) {
        
        double e = 1;

        for (int i = 1; i <= n; i++) {
            e = e + (Math.pow(x, i) / factorial(i));
        }

        
        
        return e;
    }

    public static void main(String[] args) {

        for (int precision = 1; precision <= 10; precision++) {

            System.out.println("\n\n-- PRECISION " + precision + " --");
            System.out.printf("Con precision " + precision + " el e elevado a 1 es: " + exponencial(1, precision));
            System.out.printf("\nCon precision " + precision + " el e elevado a 2 es: " + exponencial(2, precision));
            System.out.printf("\nCon precision " + precision + " el e elevado a 5 es: " + exponencial(5, precision));
        }

    }

}
