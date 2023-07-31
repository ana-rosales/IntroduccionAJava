/**
 * Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
 * muestre la suma de sus elementos.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class SumaMatriz22 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float res;
        int n, m;
        
        do {            
            System.out.print("Cantidad de filas de la matriz: ");
            n = ent.nextInt();
            System.out.print("Cantidad de columnas de la matriz: ");
            m = ent.nextInt();
        } while (n < 0 || m < 0);
        
        float[][] matriz = new float[n][m];
        
        MisFunciones.llenarMatriz(matriz, n, m, 100);
        System.out.println();
        System.out.println("Matriz generada:");
        MisFunciones.imprimirMatriz(matriz, n, m);
        res = sumaMatriz(matriz, n, m);
        
        System.out.println();
        System.out.println("La suma de los elementos de la matriz es: " + res);
        
        
    }
    
    public static float sumaMatriz(float[][] a, int n, int m){
        float suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += a[i][j];
            }
        }
        return suma;
    }
}
