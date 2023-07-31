/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
    * 0.86 libras es un 1 €
    * 1.28611 $ es un 1 €
    * 129.852 yenes es un 1 €
 */
package vectoresymatrices;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Cambio14 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String[] monedas = new String[3];
        monedas[0] = "Dolares";
        monedas[1] = "Libras";
        monedas[2] = "Yenes";
        double[] valores = new double[3];
        valores[0] = 1.28611;
        valores[1] = 0.86;
        valores[2] = 129.852;
        double euro;
        int opc;
        
        System.out.println("Ingrese la cantidad en euros.");
        euro= ent.nextFloat();
        
        System.out.println("A qué moneda quiere convertir?");
        System.out.println("1. Dolares.");
        System.out.println("2. Libras.");
        System.out.println("3. Yenes.");
        opc = ent.nextInt();
        opc--;
        
        cambiar(euro, monedas[opc], valores[opc]);
        
    }
    public static void cambiar(double euro, String moneda, double valor) {
        double resultado = euro*valor;
        System.out.println(euro + "€ = " + resultado + " " + moneda);
    }
}


