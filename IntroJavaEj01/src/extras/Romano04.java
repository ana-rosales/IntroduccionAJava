/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
 * equivalente en romano.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Romano04 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 0;
        String[] romanos = new String[10];
        
        do {            
            System.out.println("Ingrese un entero (del 1 al 10):");
            num = ent.nextInt();
        } while (num < 1 || num > 10);
        
        romanos[0] = "I";
        romanos[1] = "II";
        romanos[2] = "III";
        romanos[3] = "IV";
        romanos[4] = "V";
        romanos[5] = "VI";
        romanos[6] = "VII";
        romanos[7] = "VIII";
        romanos[8] = "IX";
        romanos[9] = "X";
        
        System.out.println("El numero " + num + " ingresado, es " + romanos[num-1] + " en romano.");
        
    }
}
