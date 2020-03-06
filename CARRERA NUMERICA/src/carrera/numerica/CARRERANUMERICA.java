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
     int vector=0;
     int vectores[]= new int[10];
     int b=0,a=1,numj=0,opc=1,ganador=0,i=0,res1,contPar=0,gana=0;
     
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
     String entrada = Datos.nextLine();
     System.out.println(entrada);
     switch (opc){
        case 1:
            while (ganador<20){
                b=0;
                a=1;
                System.out.println("------------------------------");    
                System.out.println("------------------------------");
                System.out.println("\n\n\n\n\n");
                while (a<=numj){
                    
                    System.out.println("pocicion de jugador ("+a+")= "+vectores[a]);
                    a++;
                    
                }
                    
                    
                    
                    
                    
                for (i=1;i<=numj;i++){
                    System.out.println("------------------------------");    
                    System.out.println("------------------------------");
                    System.out.println("----JUGADOR NUMERO "+i);
                    System.out.println("presione enter para lanzar los dados");
                    String entra = Datos.nextLine();
                    System.out.println(entra);
                    int dado1 = 1 + aleatorio.nextInt(6);
                    int dado2 = 1 + aleatorio.nextInt(6);
                    System.out.println("-DADO 1:  "+dado1);
                    System.out.println("-DADO 2:  "+dado2);
                    if (dado1==dado2){
                        contPar++;
                    }else{
                        contPar=0;
                    } //cieree de if dado igual
                    if (contPar==3){
                        ganador=20;
                    }//cierre de contador ganador 
                    vector=dado1+dado2;
                    vectores[i]=vector+vectores[i];
                    if (vectores[i]>=20){
                    ganador=20;
                    gana=i;
                    i=numj+1;
                    }
            }//cierre for
            }//cierre de while 
            if (ganador==20){
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡   FIN DEL JUEGO  ¡¡¡¡");
                System.out.println("GANADOR JUGADOR => "+gana);
            }    
            
            
        break; //cierre case 1
        default:
            System.out.println("¡¡¡opcion incorrecta¡¡¡¡");
            
            break;
    }//cierre de opc 
    }//ciiere de void 
    
}//cierre de class

