/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
 * debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class Chaparros06 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float sumChaparros, sumTotal, promChaparros, promTotal;
        int n, chaparros = 0;
        
        System.out.print("Ingrese la cantidad de personas a analizar: ");
        n = ent.nextInt();
        
        System.out.println("INGRESE LAS ESTATURAS:");
        float[] estaturas = new float[n];
        MisFunciones.ingresarVector(estaturas, n);
        
        sumChaparros = sumTotal = promChaparros = promTotal = 0;
        for (int i = 0; i < n; i++) {
            if(estaturas[i] < 1.60){
                sumChaparros += estaturas[i];
                chaparros++;
            }
            sumTotal += estaturas[i];
        }
        
        promChaparros = sumChaparros/chaparros;
        promTotal = sumTotal/n;
        
        System.out.println("El promedio de estaturas chaparras: " + promChaparros + " de un total de " + chaparros + " chaparros.");
        System.out.println("El promedio de estaturas total: " + promTotal + ".");
    }
}
