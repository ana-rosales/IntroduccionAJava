/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
 * en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
 * reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
 * vocales acentuadas) se mantienen sin cambios.
 * 
 * a e i o u
 * @ # $ % *
 * 
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
 * correspondiente. Utilice la estructura “según” para la transformación.
 * Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
 * La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package guia;

import java.util.Scanner;

/**
 *
 * @author Jibda
 */
public class EjemploSubproceso {
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        String frase;
        int longitud;
        
        System.out.println("CODIFICACION");
        System.out.println();
        System.out.println("Ingrese la frase:");
        frase = ent.nextLine();
        longitud = frase.length();
        
        System.out.println(codificar(frase, longitud));
        
    }
    
    public static String codificar(String frase, int longitud) {
        String x;
        for (int i = 0; i < longitud; i++) {
            x = frase.substring(i, i+1);
            switch (x.toUpperCase()){
                case "A":
                    frase = frase.replaceFirst("A", "@");
                case "E":
                    
            }
        }
        
        return frase;
    }
    
    public static void punto(){
        
    }
}
