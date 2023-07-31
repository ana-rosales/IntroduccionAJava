/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class CompararVectores19 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean iguales;
        int n;
        
        do{
            System.out.print("Ingrese el tamaño de sus vectores: ");
            n = ent.nextInt();
        }while(n<0);
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        MisFunciones.ingresarVector(a, n);
        MisFunciones.imprimirVector(a, n);
        MisFunciones.ingresarVector(b, n);
        
        iguales = MisFunciones.compararVectores(a, b, n);
        
        System.out.println("Los vectores ingresados son iguales: " + iguales);
    }
}
