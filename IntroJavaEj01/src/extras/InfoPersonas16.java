/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
 * las personas ingresadas por teclado e indique si son mayores o menores de edad.
 * Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
 * mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class InfoPersonas16 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String opc = "";
        int n, i;

        do {
            System.out.println("Cantidad de personas a analizar:");
            n = ent.nextInt();
        } while (n < 1);

        int[] edades = new int[n];
        String[] nombres = new String[n];

        System.out.println("****INGRESAR PERSONAS****");
        for (i = 0; i < n; i++) {
            System.out.println("SIGUIENTE PERSONA");
            System.out.println("Nombre:");
            ent.nextLine();
            nombres[i] = ent.nextLine();
            System.out.println("Edad:");
            edades[i] = ent.nextInt();
            System.out.println();
        }

        ent.nextLine();
        System.out.println("****MOSTRAR PERSONAS****");
        i = 0;
        do {
            System.out.println("SIGUIENTE PERSONA");
            System.out.println("Nombre:" + nombres[i]);
            System.out.println("Edad:" + edades[i]);
            if (i < n) {
                System.out.print("Continuar? S/N");
                opc = ent.nextLine();
            }
            i++;
            System.out.println();
        } while (!opc.equals("N") && i < n);
        
        System.out.println();
        System.out.println("Ya no hay más personitas, hasta luego ;)");
    }
}
