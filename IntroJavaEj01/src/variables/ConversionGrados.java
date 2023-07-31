/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package variables;
import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class ConversionGrados {
    public static void main(String[] args) {
        float C, F;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad en Celsius:");
        C = leer.nextFloat();
        
        F = 32 + (9 * C / 5);
        
        System.out.println("La conversión a Fahrenheit de " + C + "°C es " + F + "°F.");
    }
}
