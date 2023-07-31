/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 * Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Vocales03 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String letra = "";
        
        do {            
            System.out.println("Ingrese una letra:");
            letra = ent.nextLine();
        } while (letra.length() >1);
        
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("La letra '" + letra + "' ES una vocal.");
        } else {
            System.out.println("La letra '" + letra + "' NO es una vocal.");
        }
            
        
    }
}
