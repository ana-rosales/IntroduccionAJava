/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
 * matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Operaciones15 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float num1, num2, res = 0;
        int opc;

        System.out.println("Ingrese un numero:");
        num1 = ent.nextFloat();
        System.out.println("Ingrese otro numero:");
        num2 = ent.nextFloat();

        do {
            System.out.println();
            System.out.println("Como desea operar los numeros:");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println("4 - Division");
            System.out.print("=");
            System.out.println();
            opc = ent.nextInt();
        } while (opc < 1 || opc > 4);

        switch (opc) {
            case 1:
                System.out.println("SUMA.");
                res = suma(num1,num2);
                break;
            case 2:
                System.out.println("RESTA.");
                res = resta(num1, num2);
                break;
            case 3:
                System.out.println("MULTIPLICACION.");
                res = multiplicacion(num1, num2);
                break;
            case 4:
                System.out.println("DIVISION.");
                res = division(num1, num2);
        }
        
        System.out.println("El resultado de su operación es: " + res);
    }

    public static float suma(float num1, float num2){
        float res;
        res = num1 + num2;
        return res;        
    }
    
    public static float resta(float num1, float num2){
        float res;
        res = num1 - num2;
        return res;        
    }
    
    public static float multiplicacion(float num1, float num2){
        float res;
        res = num1 * num2;
        return res;        
    }
    
    public static float division(float num1, float num2){
        float res;
        if(num2 == 0){ res = 0; } 
        else { res = num1 / num2; }
        return res;        
    }
}
