/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
 * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
 * por pantalla la sopa de letras creada.
 */
package extras;

import java.util.Scanner;
import libana.MisFunciones;

/**
 *
 * @author Ana Paula
 */
public class SopaLetras23 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String palabra;
        int n = 5, m = 20;
        String[] palabras = new String[n];
        String[][] sopa = new String[m][m];
        
        MisFunciones.inicializarMatriz(sopa,m,m,"");
        
        for (int i = 0; i < n; i++) {
            do {                
                System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
                palabra = ent.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);
            
            acomodarEnSopa(palabra, sopa);
            
        }
        
        rellenarMatriz(sopa, m, m);
        System.out.println();
        System.out.println("LA SOPA:");
        MisFunciones.imprimirMatriz(sopa,m,m);
        
        
    }
    
    public static int posiblePosicion(String palabra){
        int maxPos = 20 - palabra.length();
        return maxPos;
    }
    
    public static boolean libre(String[] fila){
        boolean vacio = true;
        MisFunciones.imprimirVector(fila,fila.length);
        for (String string : fila) {
            if(!string.isEmpty()){
                vacio = false;
            }
        }
        return vacio;
    }
    
    public static void acomodarEnSopa(String palabra, String[][] sopa){
        int posPos, defPos1, defPos2;
        String letra;
        
        posPos = posiblePosicion(palabra);
        
        do {            
            defPos1 = (int) (Math.random() * posPos);
        } while (!libre(sopa[defPos1]));
        defPos2 = (int)(Math.random() * posPos);
        
        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.substring(i, i+1);
            sopa[defPos1][defPos2 + i] = letra;
            System.out.println("letra = " + letra);
        }
    }
    
    public static void rellenarMatriz(String[][] a, int n, int m){
        int num;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j].isEmpty()){
                    num = (int) (Math.random() * 10);
                    a[i][j] = String.valueOf(num);
                }
            }
        }
    }
}
