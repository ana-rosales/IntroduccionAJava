/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de números
 * comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
 * usuario al comenzar. Ejemplo: si se ingresa el número 3:
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class EscaleraNumeros13 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String escalon = "";
        int altura;
        
        do{
            System.out.println("Ingrese la altura de su escalera (igual o mayor a 1):");
            altura = ent.nextInt();
        }while(altura < 1);
        
        System.out.println();
        System.out.println("LA ESCALERA");
        for (int i = 1; i <= altura; i++) {
            escalon += String.valueOf(i);
            System.out.println(escalon);
        }
    }
}
