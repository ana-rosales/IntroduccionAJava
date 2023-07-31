/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
 * N, con los valores ingresados por el usuario.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class SumaVector18 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float res;
        int n;
        
        do{
            System.out.print("Ingrese el tamaño de su vector: ");
            n = ent.nextInt();
        }while(n<0);
        
        float[] a = new float[n];
        
        MisFunciones.ingresarVector(a, n);
        
        res = MisFunciones.sumarVector(a, n);
        
        System.out.println("La suma de los elementos ingresados es: " + res);
    }
}
