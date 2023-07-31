/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 * 
 * TIEMPO: 19min
 */
package funciones;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Pua
 */
public class Transpuesta18 {
    public static void main(String[] args) {
        int n = 4;

        int[][] matriz = new int[n][n];
        int[][] transpuesta = new int[n][n];
        
        System.out.println("MATRIZ ORIGINAL");
        MisFunciones.llenarMatriz(matriz, n, n, 51);
        MisFunciones.inicializarMatriz(transpuesta, n, n, 0);
        MisFunciones.imprimirMatriz(matriz, n, n);
        
        MisFunciones.transpuesta(matriz, transpuesta, n);
        
        System.out.println();
        System.out.println("MATRIZ TRANSPUESTA");
        MisFunciones.imprimirMatriz(transpuesta, n, n);
        
        
    }
    
    
}
