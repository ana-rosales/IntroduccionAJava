/**
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */

package variables;
import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class MostrarNombre {

    public static void main(String[] args) {
        String nombre;
        System.out.println("Ingrese nombre:");
        Scanner leer = new Scanner(System.in);
        nombre = leer.nextLine();
        System.out.println("Mi nombre es: " + nombre);
    }

}
