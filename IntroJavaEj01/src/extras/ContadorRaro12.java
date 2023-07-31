/**
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0
 * al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package extras;

import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class ContadorRaro12 {

    public static void main(String[] args) {
        int[] contador = new int[3];
        String[] contadorS = new String[3];
        MisFunciones.inicializarVector(contador, 3, 0);

        do {
            if (contador[1] == 9 && contador[2] == 9) {
                contador[1] = 0;
                contador[2] = 0;
                contador[0]++;
            } else if (contador[2] == 9) {
                contador[2] = 0;
                contador[1]++;
            } else {
                contador[2]++;
            }
            
            for (int i = 0; i < 3; i++) {
                contadorS[i] = (contador[i] == 3)? "E" : String.valueOf(contador[i]);
            }          
            
            System.out.println(contadorS[0] + "-" + contadorS[1] + "-" + contadorS[2]);
        } while (!(contador[0] == 9 && contador[1] == 9 && contador[2] == 9));
    }
}
