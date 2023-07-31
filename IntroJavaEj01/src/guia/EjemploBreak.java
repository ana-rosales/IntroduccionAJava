/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
 * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
 * resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 * Nota: recordar el uso de la sentencia break.
 */
package guia;

import java.util.Scanner;

/**
 *
 * @author Ana Pau
 */
public class EjemploBreak {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int i = 0, suma = 0, num;

        System.out.println("La suma: ");
        do {
            num = ent.nextInt();
            if(num != 0){
                System.out.print(" + ");
                suma = suma + num;
            }else{
                System.out.print(" = ");
                break;
            }
        } while (i < 20);
        System.out.println(suma);
    }
}
