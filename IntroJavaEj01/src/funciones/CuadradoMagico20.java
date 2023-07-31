/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 */
package funciones;

import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class CuadradoMagico20 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matriz = new int[n][n];
        int sumfil, sumcol, sumdiag1, sumdiag2, k;
        boolean magica;
        
        MisFunciones.matrizMagica(matriz, n);
        
        //comparar con suma de 0.0 0.1 y 0.2
        //comparar con suma de 1.0 1.1 1.2
        //comparar con suma de 2.0 2.1 2.2
        
        //comparar con suma de 0.0 + 1.0 + 2.0
        //comparar con suma de 0.1 + 1.1+ 2.1
        //comparar con suma de 0.2 + 1.2 + 2.2
        k = 2;
        sumdiag1 = 0;
        sumdiag2 = 0;
        sumfil = 0;
        sumcol = 0;
        magica = true;
        for (int i = 0; i < n; i++) {
            sumfil = 0;
            sumcol = 0;
            for (int j = 0; j < n; j++) {
                sumfil += matriz[i][j];
                sumcol += matriz[j][i];
                if(i == j){
                    sumdiag1 += matriz[i][j];
                }
                if(j == k){
                    sumdiag2 += matriz[i][j];
                }
            }
            k--;
            magica = sumfil == sumcol;
        }
        //comparar con suma de 0.1 + 1.2 + 2.3
        //comparar con suma de 0.3 + 1.2 + 2.1
        magica = (sumfil == sumcol) && (sumdiag1 == sumdiag2);
        
        System.out.println("LA MATRIZ");
        MisFunciones.imprimirMatriz(matriz, n, n);
        System.out.println();
        System.out.println("Es magica: " + magica);
        
        
        
        
    }
}
