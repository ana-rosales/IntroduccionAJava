/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre
 * dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
 * si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
 * al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
 * utilizar la función Math.random() de Java.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class AdivinaProducto10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int resp, fact1, fact2, prod;
        
        fact1 = (int) (Math.random() * 10);
        fact2 = (int) (Math.random() * 10);
        prod = fact1 * fact2;
        
        do {            
            System.out.println("Intente adivinar el producto!");
            resp = ent.nextInt();
        } while (resp != prod);
        
        System.out.println("CORRECTO!");
        System.out.println("La operacion fue: " + fact1 + " X " + fact2 + " = " + prod + ".");
    }
}
