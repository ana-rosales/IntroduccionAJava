/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */

package bucles;

import java.util.Scanner;

/**
 *
 * @author Ana Pau
 */
public class Menu {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num1, num2, operacion, res;
        String mensaje, salir;
        
        System.out.println("Ingrese dos numeros a sumar:");
        num1 = ent.nextInt();
        num2 = ent.nextInt();
        
        do{
            mensaje = "Desea salir?S/N";
                    res = 0;
            System.out.println("Elija una opción\n"
                    + "MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:");
            operacion = ent.nextInt();
            switch (operacion){
                case 1:
                    res = num1 + num2;
                    break;
                case 2:
                    res = num1 - num2;
                    break;
                case 3:
                    res = num1 * num2;
                    break;
                case 4:
                    res = num1 / num2;
                    break;
                case 5:
                    mensaje = "Quisiera permanecer en el programa?S/N";
                    break;
                default:
                    mensaje = "Su opción ha sido invalida, desea volver a intentarlo?S/N";
            }
            
            System.out.println("La respuesta a su operación fue: " + res);
            
            mensaje(mensaje);
            ent.nextLine();
            salir = ent.nextLine();
            
        } while(salir.equalsIgnoreCase("N"));
    }
    
    public static void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}
