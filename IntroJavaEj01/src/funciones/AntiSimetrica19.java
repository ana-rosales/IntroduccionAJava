/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
 * matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
 * signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
 * denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package funciones;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class AntiSimetrica19 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        boolean iguales;
        int n;
        
        do {
            System.out.print("Indique la dimension de su matriz cuadrada (entero positivo):\n= ");
            n = ent.nextInt();
        } while (n <= 0);
        
        int[][] matriz = new int[n][n];
        int[][] transpuesta = new int[n][n];
        int[][] transpuestaNeg = new int[n][n];
        
        MisFunciones.ingresarMatriz(matriz, n, n);
        
        System.out.println();
        System.out.println("MATRIZ ORIGINAL");
        MisFunciones.imprimirMatriz(matriz, n, n);
           
        MisFunciones.inicializarMatriz(transpuesta, n, n, 0);
        MisFunciones.transpuesta(matriz, transpuesta, n);
        
        System.out.println();
        System.out.println("MATRIZ TRANSPUESTA NEGATIVA");
        MisFunciones.matrizNegativa(transpuesta, transpuestaNeg, n, n);
        MisFunciones.imprimirMatriz(transpuestaNeg, n, n);
        
        iguales = MisFunciones.compararMatrices(matriz, transpuestaNeg, n, n);
        
        System.out.println();
        if(iguales){ System.out.println("La matriz ingresada es anti-simetrica."); }
        else { System.out.println("La matriz ingresada no es anti-simetrica."); }
        
    }
}
