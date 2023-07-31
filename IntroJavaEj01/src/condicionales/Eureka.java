package condicionales;


import java.util.Scanner;

/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 * la función equals() en Java.
 */

/**
 *
 * @author Ana Pau
 */
public class Eureka {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        String clave = "Eureka";
        
        System.out.println("Ingrese una frase.");
        String frase = ent.nextLine();
        
        boolean correcto = frase.equalsIgnoreCase(clave);
        
        if (correcto){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
        
    }
    
}
