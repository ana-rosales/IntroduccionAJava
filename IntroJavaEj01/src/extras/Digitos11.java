/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
 * de división. Nota: recordar que las variables de tipo entero truncan los números o
 * resultados.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Digitos11 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, digitos = 0;

        do {
            System.out.println("Ingrese un entero positivo:");
            num = ent.nextInt();
        } while (num < 0);
        
        if(num == 0){ digitos++; }
        else{
            while (num > 0) {
                num /= 10;
                digitos++;
            }
        }
        
        System.out.println("Número de digitos del número ingresado: " + digitos);
        
    }
}
