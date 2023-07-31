/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia;

import java.util.Scanner;

/**
 *
 * @author Ana Pau
 */
public class EjermplosScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        boolean mentira;
        double calificacion;
        char califGringa;
        
        System.out.println("Pasó el examen?");
        mentira = ent.nextBoolean();
        
        System.out.println("Ingrese su calificacion [ej.: 10.00]");
        calificacion = ent.nextDouble();
        
        ent.nextLine(); //consumir salto de linea
        
        System.out.println("Ingrese su calificacion [ej.: A]");
        califGringa = ent.nextLine().charAt(0); //se obtiene primer caracter
        
        System.out.println("Usted es un mentiroso? " + mentira);
        System.out.println("Su calificacion en gringo: " + califGringa);
        
        
    }
    
}
