/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera.numerica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MELO
 */
public class CARRERANUMERICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Random aleatorio = new Random();
     Scanner Datos;
     Datos = new Scanner(System.in);
     int numj,opc=1,ganador=0;
     System.out.println("          CARRERA NUMERICA");
     System.out.println("   *Numeros de jugadores minimo 2");
     System.out.println("   *Numeros de jugadores maximo 4");
     System.out.println("--Digite numeros de jugadores: ");
     numj = Datos.nextInt();
     if (numj<2 || numj>4 ){
     while (numj<2 || numj>4 ){
        System.out.println("-----ERROR JUGADORES MINIMO 2 Y MAXIMO 4------");
         System.out.println("--Digite numeros de jugadores: ");
        numj = Datos.nextInt();
     }// cierre de while jugadores
     }//cierre de if jugadores
     System.out.println("                    MENU                  ");
     System.out.println("1. NIVEL BASICO (TABLERO DE 20 POSICIONES)");
     System.out.println("2. NIVEL INTERMEDIO (TABLERO DE 30 POSICIONES)");
     System.out.println("3. NIVEL AVANZADO (TABLERO DE 50 POSICIONES)");
     opc = Datos.nextInt();
     switch (opc){
        case 1:
            while (ganador<=20){
            System.out.println("----JUGADOR NUMERO 1");
            System.out.println("presione enter para lanzar los dados");
            String entrada = Datos.nextLine();
            System.out.println(entrada);
            int dado1 = 1 + aleatorio.nextInt(6);
            int dado2 = 1 + aleatorio.nextInt(6);
            System.out.println("-DADO 1:  "+dado1);
            System.out.println("-DADO 2:  "+dado2);
            }//cierre de while 20
            
            
            
        break; //cierre case 1
        default:
            System.out.println("¡¡¡opcion incorrecta¡¡¡¡");
            
            break;
    }//cierre de opc 
    }//ciiere de void 
    
}//cierre de class

