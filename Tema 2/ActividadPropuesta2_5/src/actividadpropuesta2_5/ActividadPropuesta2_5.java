package actividadpropuesta2_5;

import java.util.Scanner;

public class ActividadPropuesta2_5 {
    public static void main(String[] args) {

        double aforo, precio, vendidas, total, rebaja, ventaRebaja, veinteAforo, cincuentaAforo;

        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuál es el aforo máximo del concierto?");
        aforo = sc.nextDouble();
        
        System.out.println("¿Cuál es el precio por cada entrada?");
        precio = sc.nextDouble();
        
        System.out.println("¿Cuántas entradas se han vendido?");
        vendidas = sc.nextDouble();
        
        
        veinteAforo = aforo*0.2;
        cincuentaAforo = aforo*0.5;

        rebaja = precio*0.25;
        ventaRebaja = (precio-rebaja)*vendidas;
        
        total = precio*vendidas;
        
        if (vendidas<=veinteAforo) {
            System.out.println("El concierto se cancela");
            
        } else if (vendidas<=cincuentaAforo && vendidas>veinteAforo) {
            System.out.println("Al no superar el 50%, el precio de la entrada será de: " + (precio-rebaja) );
            System.out.println("Por lo tanto se habrá recaudado: " + ventaRebaja);
            
        } else if (aforo>cincuentaAforo) {
            System.out.println("Al superar el 50% del aforo, el dinero recaudado es de: " + total);
        }
        
        
        
        
        
        
        
        
        
        


    }
    
}
