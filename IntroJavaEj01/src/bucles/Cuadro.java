/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Cuadro {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int l;
        
        System.out.println("Dimensión del cuadrado:");
        l = ent.nextInt();
        
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if(i == 0 || i == l-1 || j == 0 || j == l-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }                  
            }
            System.out.println("");
        }
    }
}
