/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
 * hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
 * de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class EdadesChamacos14 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float sumaHijos, promHijos, sumaFamilias, promFamilias;
        int n, m;

        do {
            System.out.println("Cantidad de familias a analizar:");
            n = ent.nextInt();
        } while (n < 1);

        int[] familias = new int[n];

        promFamilias = 0;
        sumaFamilias = 0;
        for (int familia : familias) {
            System.out.println();
            System.out.println("SIGUIENTE FAMILIA");
            do {
                System.out.println("Cantidad de hijos que tiene:");
                m = ent.nextInt();
            } while (m < 1);
            
            promHijos = 0;
            sumaHijos = 0;
            System.out.println("Ingrese sus alturas:");
            for (int i = 0; i < m; i++) {
                System.out.print("=");
                sumaHijos += ent.nextFloat();
            }
            promHijos = sumaHijos/m;
            sumaFamilias += promHijos;
            
            System.out.println("El promedio de alturas de sus hijos: " + promHijos);
        }
        promFamilias = sumaFamilias/n;
        
        System.out.println();
        System.out.println();
        System.out.println("RESULTADO FINAL");
        System.out.println("El promedio de alturas de todas las familias es: " + promFamilias);
    }
}
