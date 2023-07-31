/**
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */

package variables;
import java.util.Scanner;

public class SumaDosNum {
    
    public static void main(String[] args) {
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba el primer número:");
        num1 = leer.nextInt();
        System.out.println("Escriba el segundo número:");
        num2 = leer.nextInt();
        
        suma = num1 + num2;
//        leer.nextLine(); // Consumir la nueva línea pendiente
//        
//        String nombre = leer.nextLine();         
        
        System.out.println("El resultado de " + num1 + " + " + num2 + " = " + suma);
    }
}
