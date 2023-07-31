/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
 * adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
 * desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
 * prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    * Primer trabajo práctico evaluativo 10%
    * Segundo trabajo práctico evaluativo 15%
    * Primer Integrador 25%
    * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
 * programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
 * desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
 * igual al 7 de sus notas del curso.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author Ana Paula
 */
public class Aprobados21 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float prac1, prac2, int1, int2;
        int n = 10, aprobados, reprobados;
        double prom;
        
        double[] promedios = new double[n];
        aprobados = reprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("INGRESE LAS CALIFICACIONES DEL ALUMNO " + i);
            System.out.println("Deben ser positivas menores de 10.");
            do {
                System.out.print(" - Calificacion del primer practico): ");
                prac1 = ent.nextFloat();
            } while (prac1 < 0 || prac1 > 10);
            do {
                System.out.print(" - Calificacion del segundo practico: ");
                prac2 = ent.nextFloat();
            } while (prac2 < 0 || prac2 > 10);
            do {
                System.out.print(" - Calificacion del primer integrador: ");
                int1 = ent.nextFloat();
            } while (int1 < 0 || int1 > 10);
            do {
                System.out.print(" - Calificacion del segundo integrador: ");
                int2 = ent.nextFloat();
            } while (int2 < 0 || int2 > 10);
            
            prom = (prac1 * 0.10) + (prac2 * 0.15) + (int1 * 0.25) + (int2 * 0.5);
            promedios[i] = prom;
            
            System.out.println("Promedio ingresado = " + prom);
        }
        
        for (int i = 0; i < 10; i++) {
            if(promedios[i] < 7){
                reprobados++;
            } else {
                aprobados++;
            }
        }
        
        System.out.println();
        System.out.println("Los aprobados son: " + aprobados);
        System.out.println("Los reprobados son: " + reprobados);
    }
}
