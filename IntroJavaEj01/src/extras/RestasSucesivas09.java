/**
 * Simular la división usando solamente restas. Dados dos números enteros mayores que
 * uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
 * Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
 * resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class RestasSucesivas09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int divisor, dividendo, residuo, cociente;
        divisor = dividendo = residuo = cociente = 0;
        
        do {            
            System.out.println("Ingrese el dividendo:");
            dividendo = ent.nextInt();
            System.out.println("Ingrese el divisor:");
            divisor = ent.nextInt();
        } while (divisor < 1 || dividendo < 1);
        
        do {            
            residuo = dividendo - divisor;
            dividendo = residuo;
            cociente++;
        } while (residuo > divisor);
        
        System.out.println("El cociente de la division es: " + cociente);
        System.out.println("El residuo es: " + residuo);
            
    }
}
