/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 * TIEMPO = 38min
 */
package funciones;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class DigitosVector17 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, digitos;
        int[] noDigitos = new int[5];

        MisFunciones.inicializarVector(noDigitos, 5, 0);

        do {
            System.out.print("Indique la cantidad total de números que tendrá su vector (entero positivo):\n= ");
            n = ent.nextInt();
        } while (n <= 0);

        int[] vector = new int[n];

        MisFunciones.llenarVector(vector, n, 100000);
        MisFunciones.imprimirVector(vector, n);

        for (int i : vector) {
            digitos = 0;
            contarDigitos(i,digitos,noDigitos);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println( (i+1) + " digito = " + noDigitos[i] );
        }

    }
    
    public static void contarDigitos(int i, int digitos, int[] noDigitos){
        if (i == 0) {
                digitos++;
            } else {
                while (i > 0) {
                    i /= 10;
                    digitos++;
                }
            }
            noDigitos[digitos - 1]++;
    }
}
