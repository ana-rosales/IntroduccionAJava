package condicionales;


import java.util.Scanner;

/**
 * Crear un programa que dado un numero determine si es par o impar.
 */

/**
 *
 * @author Ana Pau
 */
public class ParImpar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        int num = ent.nextInt();
        
        if(num%2 == 0){
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
        
    }
    
}
