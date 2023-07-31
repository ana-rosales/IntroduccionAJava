/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
 * una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
 * tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
 * iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Reemplazos02 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int A, B, C, D, aux;
        
        System.out.println("Ingrese un valor para A:");
        A = ent.nextInt();
        System.out.println("Ingrese un valor para B:");
        B = ent.nextInt();
        System.out.println("Ingrese un valor para C:");
        C = ent.nextInt();
        System.out.println("Ingrese un valor para D:");
        D = ent.nextInt();
        
        System.out.println("Los valores iniciales son A= " + A + ", B=" + B + ", C= " + C + ", D= " + D);
        
        aux = B; //B guardado
        B = C; //C guardado
        C = A; //A guardado
        A = D; //D guardado
        D = aux; 
        
        System.out.println("Los valores finales son A= " + A + ", B=" + B + ", C= " + C + ", D= " + D);
        
    }
}
