/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class MinutosADiasYHoras01 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int minutos, dias, horas;
        
        //1 dia = 24h = 1440min
        //1h = 60min
        
        System.out.println("Ingrese los minutos a convertir.");
        minutos = ent.nextInt();
        
        dias = minutos/1440;
        minutos = minutos - 1440*dias;
        
        horas = minutos/60;
        minutos = minutos - 60*horas;
        
        System.out.println("Los minutos ingresados equivalen a: " + dias + " dias, " + horas + " horas, " + minutos + " minutos.");               
    }
}
