/**
 * Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
 * parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class VectorAleatorio20 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n,m;

        do {
            System.out.println();
            System.out.print("Ingrese la cantidad de valores posibles: ");
            m = ent.nextInt();
        } while (m < 0);
        
        String[] a = new String[m];
        
        System.out.println("Ingrese los posibles valores del vector: ");
        MisFunciones.ingresarVector(a, m);
        
        do{
            System.out.println();
            System.out.print("Indique el tamanio del vector final: ");
            n = ent.nextInt();
        }while(n < 0);
        String[] vector = new String[n];
        
        MisFunciones.llenarVector(vector, a, n, m);
        System.out.println();
        System.out.println("VECTOR FINAL: ");
        MisFunciones.imprimirVector(vector, n);
        
        
    }
    
    
    
    
    
    
}
