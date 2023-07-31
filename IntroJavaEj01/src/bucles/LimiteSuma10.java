/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Ana Pua
 */
public class LimiteSuma10 {
    
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        int lim, suma;
        
        do {         
            System.out.println("Ingrese un valor limite positivo (entero):");
            lim = ent.nextInt();
        } while (lim <= 0);
        
        System.out.print("suma = ");
        suma = 0;
        while (suma < lim){
            suma += ent.nextInt();
            System.out.print(" + " );
        }
        
        System.out.println(" = " + suma);
        System.out.println("La suma " + suma + " sobrepasa el limite " + lim + ".");

        
        
    }
    
}
