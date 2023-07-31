/**
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 * en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

package variables;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class MayusMinus {
    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese frase:");
        frase = leer.nextLine();
        
       frase.toUpperCase();
        System.out.println("La frase ingresada en mayusculas es: " + frase);
        
        frase = frase.toLowerCase();
        System.out.println("La frase ingresada en minusculas es: " + frase);
        
        
    }
}
