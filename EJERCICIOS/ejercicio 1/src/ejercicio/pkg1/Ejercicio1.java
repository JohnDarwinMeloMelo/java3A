/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner Datos;
        Datos = new Scanner(System.in);
        int a=1,gana=0,falla=-1;
        while (a==1) {
            System.out.println("presione enter para lanzar (2) los dados");
            String entra = Datos.nextLine();
            System.out.println(entra);
            int dado1 = 1 + aleatorio.nextInt(6);
            int dado2 = 1 + aleatorio.nextInt(6);
            System.out.println("-DADO 1:  "+dado1);
            System.out.println("-DADO 2:  "+dado2);
            if (dado1==1 && dado2==1){
                a=2;
                
                System.out.println("FIN DEL JUEGO");
                System.out.println("EL PAR GENERADO FUE 1 1");
            }
            gana++;
            falla++;
        }
        System.out.println("INTENTOS FALLIDOS: "+falla);
        System.out.println("INTENTO GANADO : "+gana);
        }
    
    }
    

