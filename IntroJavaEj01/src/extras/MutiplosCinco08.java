/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
 * detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
 * la cantidad de números impares. Al igual que en el ejercicio anterior los números
 * negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula 
 */
public class MutiplosCinco08 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 0, pares = 0, impares = 0, total = 0;
        
        do {            
            System.out.println("Ingrese un numero:");
            num =  ent.nextInt();
            if(num%2 == 0){ pares++; } 
            else { impares++; }
            total++;
        } while (num%5 != 0);
        
        System.out.println("Numeros leidos en total: " + total);
        System.out.println("Numeros pares leidos: " + pares);
        System.out.println("Numeros impares: " + impares);
               
    }
}
