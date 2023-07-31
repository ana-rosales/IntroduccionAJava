/**
 * Realizar un programa que complete un vector con los N primeros números de la sucesión
 * de Fibonacci.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Pau 
 */
public class Fibonacci24 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        
        do {            
            System.out.print("Ingrese hasta que numero desea ver: ");
            n = ent.nextInt();
        } while (n < 0);
        
        int[] fibonacci = new int[n];
         
        generarFibonacci(fibonacci, n);
        System.out.println();
        System.out.println("LA SERIE:");
        MisFunciones.imprimirVector(fibonacci,n);
    }
    
    public static void generarFibonacci(int[] fibonacci, int n){
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
    }
}
