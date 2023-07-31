/**
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
 * se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
 * que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
 * la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package funciones;

import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class MatrizEnMatriz {
    public static void main(String[] args) {
        int n = 10, m = 3;
        int[][] grande = new int[n][n];
        int[][] chica = new int[m][m];
        int[] posicion = new int[2];
        
        
        
        //creación de matriz con números aleatorios del 1 al 99
        MisFunciones.llenarMatriz(grande, n, n, 100);
        
        System.out.println("MATRIZ:");
        MisFunciones.imprimirMatriz(grande, n, n);
        
        System.out.println();
        System.out.println("SUB-MATRIZ A BUSCAR:");
        MisFunciones.ingresarMatriz(chica, m, m);
        MisFunciones.imprimirMatriz(chica, m, m);
        
        posicion = buscarSubMatriz(grande, chica, n, m);
        
        System.out.println();
        System.out.println("La matriz se encuentra en la posición [" + posicion[0] + "][" + posicion[1] + "].");
    }
    
    public static int[] buscarSubMatriz(int[][] principal, int[][] submatriz, int tamP, int tamS){
        boolean iguales = false;
        int[][] temp = new int[tamS][tamS];
        int[] posicion = new int[2];
        
        for (int i = 0; i < tamP-2; i++) {
            for (int j = 0; j < tamP-2; j++) {
                //llenar temp
                for (int k = 0; k < tamS; k++) {
                    for (int l = 0; l < tamS; l++) {
                        temp[k][l] = principal[i+k][j+l];
                    }
                }
                iguales = MisFunciones.compararMatrices(temp, submatriz, tamS, tamS);
                if(iguales){
                    posicion[0] = j;
                    posicion[1] = i;
                    break;
                }
            }
            if(iguales){ break; }
        }
        
        return posicion;
    }
}
