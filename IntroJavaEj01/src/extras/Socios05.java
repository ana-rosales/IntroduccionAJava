/**
 * Una obra social tiene tres clases de socios:
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
 * todos los tipos de tratamientos.
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
 * los mismos tratamientos que los socios del tipo A.
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos.
 * o Solicite una letra (carácter) que representa la clase de un socio, soy luego un valor
 * real que represente el costo del tratamiento (previo al descuento) y determine el
 * importe en efectivo a pagar por dicho socio.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Socios05 {
    public static void main(String[] args) {
        String[] socio = new String[3];
        float[] descuentos = new float[3];
        Scanner ent = new Scanner(System.in);
        String letra = "";
        float costo = 0f;
        
        socio[0] = "A";
        socio[1] = "B";
        socio[2] = "C";
        
        descuentos[0] = 0.50f;
        descuentos[1] = 0.35f;
        descuentos[2] = 0.0f;
        
        do {            
            System.out.println("Ingrese su tipo de socio:");
            letra = ent.nextLine();
        } while (letra.length() > 1 && (!letra.equals("A") || !letra.equals("B") || !letra.equals("C")));
        
        do {            
            System.out.println("Ingrese el costo de su tratamiento:");
            costo = ent.nextFloat();
        } while (costo <0);
        
        if(letra.equals("A")){
            costo -= costo*descuentos[0];
        }else if(letra.equals("B")){
            costo -= costo*descuentos[1];
        }else if(letra.equals("C")){
            costo -= costo*descuentos[2];
        }
        
        System.out.println("Como socio " + letra + " el costo final de su tratamiento es: " + costo + ".");
        
    }
}
