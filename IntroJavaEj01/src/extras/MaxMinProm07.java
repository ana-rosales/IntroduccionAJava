/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
 * de n números (n>0). El valor de n se solicitará al principio del programa y los números
 * serán introducidos por el usuario. Realice dos versiones del programa, una usando el
 * bucle “while” y otra con el bucle “do - while”.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class MaxMinProm07 {

    static int min = 0, max = 0, suma = 0;
    static float prom;
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, opc;

        do {
            System.out.println("Ingrese el total de números:");
            n = ent.nextInt();
        } while (n <= 0);

        int[] numeros = new int[n];
        System.out.println("INGRESE ENTEROS POSITIVOS.");
        ingresarVector(numeros, n);
        
        do {
            System.out.println();            
            System.out.println("Resolver por:");
            System.out.println("1 - For");
            System.out.println("2 - While");
            System.out.println("3 - Do while");
            opc = ent.nextInt();
            System.out.println();
        } while (opc < 1 || opc > 3);
        
        
        switch(opc){
            case 1:
                maxMinPromFor(numeros, n);
                break;
            case 2:
                maxMinPromWhile(numeros, n);
                break;
            case 3:
                maxMinPromDoWhile(numeros, n);
        }        

        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es: " + min);
        System.out.println("Y el promedio es: " + prom);
    }

    public static void ingresarVector(int[] a, int n) {
        Scanner ent = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            do {                
                System.out.print("[" + i + "] =");
                a[i] = ent.nextInt();
            } while (a[i] < 0);
        }
    }
    
    public static void maxMinPromFor(int[] numeros, int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) { min = numeros[i]; }
            else if (numeros[i] < min) { min = numeros[i]; }
            if (numeros[i] > max) { max = numeros[i]; }
            suma += numeros[i];
        }
        promedio(suma, n);
    }
    
    public static void maxMinPromWhile(int[] numeros, int n){
        int i = 0;
        min = numeros[0];        
        while(i < n){
            if (numeros[i] < min) { min = numeros[i]; }
            if (numeros[i] > max) { max = numeros[i]; }
            suma += numeros[i];
            i++;
        }
        promedio(suma,  n);
    }
    
    public static void maxMinPromDoWhile(int[] numeros, int n){
        int i = 0;
        do {   
            if (i == 0) { min = numeros[i]; }
            else if (numeros[i] < min) { min = numeros[i]; }
            if (numeros[i] > max) { max = numeros[i]; }
            suma += numeros[i];
            i++; 
        } while (i < n);
        promedio(suma, n);
    }
    
    public static void promedio(int suma, int n){
        String sumaS = "";
        sumaS = String.valueOf(suma);
        prom = Float.parseFloat(sumaS) / n;
    }
}
