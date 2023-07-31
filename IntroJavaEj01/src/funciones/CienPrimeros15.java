/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 */
package funciones;

/**
 *
 * @author Ana Paula
 */
public class CienPrimeros15 {
    public static void main(String[] args) {
        int n = 101;
        int[] enteros = new int[n];
        
        llenarVector(enteros, n);
        imprimirVector(enteros, n);
        imprimirReverso(enteros, n);
    }
    
    public static void llenarVector(int[] a, int n){
        for (int i = 1; i <= n-1; i++) {
            a[i] = i;
        }
    }
    
    public static void imprimirVector(int[] a, int n) {
        for (int elem : a) {
            System.out.println(elem);
        }
    }
    
    public static void imprimirReverso(int[] a, int n) {
        for (int i = n-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
    
}
