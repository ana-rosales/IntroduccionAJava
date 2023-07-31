/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 * 
 * TIEMPO: 26min
 */
package funciones;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class BusquedaNumero {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, encontrado;
        
        do {
            System.out.print("Indique la cantidad total de números que tendrá su vector (entero positivo):\n= ");
            n = ent.nextInt();
        } while (n <= 0);      
        
        int[] vector = new int[n];
        
        MisFunciones.llenarVector(vector, n, 10);
        MisFunciones.imprimirVector(vector, n);
        
        do{
            System.out.println("Ingrese un número a buscar [0-9]:");
            n = ent.nextInt();
        } while (n > 9 || n < 0);
        
        System.out.println("El número se encuentra en las posiciones: ");
        encontrado = 0;
        for (int i = 0; i < vector.length ; i++) {
            if(n == vector[i]){
                System.out.print(i + ", ");
                encontrado++;
            }
        }
        if (encontrado == 0) {
            System.out.println("No se encontró el número :c");                    
        }
        
    }
}
