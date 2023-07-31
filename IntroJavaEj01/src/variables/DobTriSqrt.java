/**
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package variables;

import java.util.Scanner;

/**
 *
 * @author Ana Pau
 */
public class DobTriSqrt {
    //atributo de clase tienen valores por default
//    byte experimentoB;
//    String experimentoS;
//    boolean experimentoL;

    public static void main(String[] args) {
        double num, dob, tri, sqrt;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese entero:");
        num = leer.nextInt();
        
        dob = 2*num;
        tri = 3*num;
        sqrt = Math.sqrt(num);
        
        System.out.println("El doble de " + num + " es " + dob);
        System.out.println("El triple de " + num + " es " + tri);
        System.out.println("La raíz cuadrada de " + num + " es " + sqrt);
        
        // variable local es necesario inicializarla
//        byte experimentoB;
//        String experimentoS;
//        boolean experimentoL;
        
//        DobTriSqrt experimento = new DobTriSqrt();
//        System.out.println(experimento.experimentoB);
//        System.out.println(experimento.experimentoS);
//        System.out.println(experimento.experimentoL);
        
    }
}
