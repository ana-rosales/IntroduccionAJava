/**
 * Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
 * por parámetro para que nos indique si es o no un número primo, debe devolver true si es
 * primo, sino false.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Primo17 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean primo;
        int num;
        
        do {            
            System.out.print("Ingrese un entero positivo:");
            num = ent.nextInt();
        } while (num <= 0 || num < 214748363);
        
        primo = esPrimo(num);
        
        System.out.println("El numero es primo: " + primo);
    }
    
    public static boolean esPrimo(int num) {
        int aux = 1;
        boolean primo = true;
        do {
            if (num % aux == 0 && aux != 1 && aux != 0) {
                primo = false;
            }
            aux++;
        } while (aux < num);
        
        return primo;
    }
}
