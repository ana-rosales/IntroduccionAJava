/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser
* de un máximo de 5 caracteres de largo,
* el primer carácter tiene que ser
* X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,
* la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class RS232 {    
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String cadena, current;
        int correctas, incorrectas, total, incremento, restante, largo;
        boolean correcta, incorrecta, FDA;
        
        System.out.println("Ingrese la cadena RS232 a evaluar [NO LLEVA ESPACIOS].");
        cadena = ent.next();
       
            
        //inicializar
        correctas = 0;
        incorrectas = 0;
        incremento = 1;
        largo = 0;
        restante = 0;
        incorrecta = false;
        correcta = false;

        cadena = cadena.toUpperCase();
        for (int i = 0; i < cadena.length(); i = i + incremento) {
            //IndexOutOfBounds, entonces revisar
            restante = cadena.length() - i; //si no funciona restar 1
            if (restante >= 5) {
                largo = 5;
            } else {
                largo = restante;
            }
            if (incremento > 1) {
                incremento = 1;
            }
            
            if (cadena.charAt(i) == '&') {
                //  extrae el substring hasta su lenght 5
                current = cadena.substring(i, i + largo);
                //  recorrerlo y si todas son '&' break;
                if(current.length() < 5){ FDA = false; }
                else {
                    FDA = true;
                    for (int j = 0; j < largo; j++) {
                        if (current.charAt(i) != '&') {
                            FDA = false;
                        }
                    }
                }
                if (FDA) {
                    break;
                }
            } else if (cadena.charAt(i) != 'X' && !incorrecta) {
                correcta = false;
                incorrecta = true;
                incorrectas++;
            }
            
            if (cadena.charAt(i) == 'X') {

                current = cadena.substring(i, i + largo);

                for (int j = 0; j < largo; j++) {
                    if (current.charAt(j) == 'O') {
                        incorrecta = false;
                        correcta = true;
                        correctas++;
                        incremento = j + 1;
                    }
                }
                if (!correcta && !incorrecta) {
                    incorrecta = true;
                    incorrectas++;
                }
            }
        }

        total = correctas+incorrectas;
        System.out.println("");
        System.out.println("Las cadenas correctas comienzan con X y terminan con O."); 
        System.out.println("");
        System.out.println("Cadenas correctas: " + correctas);
        System.out.println("Cadenas incorrectas: " + incorrectas);
        System.out.println("Total de cadenas: " + total);
       
    }
}
