package condicionales;


import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 * usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Lenght() en Java.
 */

/**
 *
 * @author Ana Pau
 */
public class OchoChar {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = ent.nextLine();
        
        if(frase.length() == 8){
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO!");
        }
    }
    
}
