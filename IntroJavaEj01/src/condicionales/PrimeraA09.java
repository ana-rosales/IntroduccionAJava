/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Jibda
 */
public class PrimeraA09 {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String palabra;
        char a = 'A';
        boolean esA;
        
        
        System.out.println("Ingrese una palabra o frase:");
        palabra = ent.nextLine();
        esA = String.valueOf(palabra.charAt(0)).equalsIgnoreCase(String.valueOf(a));
        
        if(esA){
            System.out.println("La primera letra es A. CORRECTO!");
        } else {
            System.out.println("INCORRECTO! La primera letra NO es A.");
        }
        
        
    }
}
