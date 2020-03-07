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
     int contPar[]= new int[10]; 
     int b=0,a=1,numj=0,opc=1,ganador=0,i=0,res1,gana=0;
     
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
                System.out.println("LA META ES => 20");
                while (a<=numj){
                    
                    System.out.println("pocicion de jugador ("+a+")= "+vectores[a]);
                    a++;
                    
                }
                    
                    
                     
                    
                   
                    for (i=1;i<=numj;i++){
                        
                         if (vectores[i]+6<20){
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (2) los dados");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            int dado2 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            System.out.println("-DADO 2:  "+dado2);




                            if (dado1==dado2){
                                contPar[i]++;
                            }else{
                                contPar[i]=0;
                            } //cieree de if dado igual
                            if (contPar[i]==3){
                                System.out.println("¡¡¡RACHA 3 PARES SEGUIDOS GANAS EN JUEGO");
                                vectores[i]=20;
                                ganador=20;
                            }//cierre de contador ganador 
                            
                            
                            if (contPar[i]<3){
                            vector=dado1+dado2;
                            vectores[i]=vector+vectores[i];
                            }//cierre de conador pasa
                              


                            if (vectores[i]>20 ){
                            vectores[i]=vectores[i]-vector;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 20 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==20){
                            ganador=20;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR 
                        }else{
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (1) dado");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            
                            vectores[i]=dado1+vectores[i];
                            
                            if (vectores[i]>20 ){
                            vectores[i]=vectores[i]-dado1;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 20 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==20){
                            ganador=20;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR
                         }
                         
                        
                         
                         
                         
                    }//cierre for
                        
            }//cierre de while 
            if (ganador==20){
                System.out.println("\n\n\n");
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡   FIN DEL JUEGO  ¡¡¡¡");
                System.out.println("GANADOR JUGADOR => "+gana);
            }//ciiere de GANADOR     
            
            
        break; //cierre case 1
        
    
        
        
        
        case 2:
            while (ganador<30){
                b=0;
                a=1;
                System.out.println("------------------------------");    
                System.out.println("------------------------------");
                System.out.println("\n\n\n\n\n");
                System.out.println("LA META ES => 30");
                while (a<=numj){
                    
                    System.out.println("pocicion de jugador ("+a+")= "+vectores[a]);
                    a++;
                    
                }
                    
                    
                     
                    
                   
                    for (i=1;i<=numj;i++){
                        
                         if (vectores[i]+6<30){
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (2) los dados");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            int dado2 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            System.out.println("-DADO 2:  "+dado2);




                            if (dado1==dado2){
                                contPar[i]++;
                            }else{
                                contPar[i]=0;
                            } //cieree de if dado igual
                            if (contPar[i]==3){
                                System.out.println("¡¡¡RACHA 3 PARES SEGUIDOS GANAS EN JUEGO");
                                vectores[i]=30;
                                ganador=30;
                            }//cierre de contador ganador 
                            
                            
                            if (contPar[i]<3){
                            vector=dado1+dado2;
                            vectores[i]=vector+vectores[i];
                            }//cierre de conador pasa
                              


                            if (vectores[i]>30 ){
                            vectores[i]=vectores[i]-vector;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 30 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==30){
                            ganador=30;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR 
                        }else{
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (1) dado");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            
                            vectores[i]=dado1+vectores[i];
                            
                            if (vectores[i]>30 ){
                            vectores[i]=vectores[i]-dado1;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 20 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==30){
                            ganador=20;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR
                         }
                         
                        
                         
                         
                         
                    }//cierre for
                        
            }//cierre de while 
            if (ganador==30){
                System.out.println("\n\n\n");
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡   FIN DEL JUEGO  ¡¡¡¡");
                System.out.println("GANADOR JUGADOR => "+gana);
            }//ciiere de GANADOR     
            
            
        break; //cierre case 2
        
        
        
        
        case 3:
            while (ganador<50){
                b=0;
                a=1;
                System.out.println("------------------------------");    
                System.out.println("------------------------------");
                System.out.println("\n\n\n\n\n");
                System.out.println("LA META ES => 50");
                while (a<=numj){
                    
                    System.out.println("pocicion de jugador ("+a+")= "+vectores[a]);
                    a++;
                    
                }
                    
                    
                     
                    
                   
                    for (i=1;i<=numj;i++){
                        
                         if (vectores[i]+6<50){
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (2) los dados");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            int dado2 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            System.out.println("-DADO 2:  "+dado2);




                            if (dado1==dado2){
                                contPar[i]++;
                            }else{
                                contPar[i]=0;
                            } //cieree de if dado igual
                            if (contPar[i]==3){
                                System.out.println("¡¡¡RACHA 3 PARES SEGUIDOS GANAS EN JUEGO");
                                vectores[i]=50;
                                ganador=50;
                            }//cierre de contador ganador 
                            
                            
                            if (contPar[i]<3){
                            vector=dado1+dado2;
                            vectores[i]=vector+vectores[i];
                            }//cierre de conador pasa
                              


                            if (vectores[i]>50 ){
                            vectores[i]=vectores[i]-vector;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 50 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==50){
                            ganador=50;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR 
                        }else{
                            System.out.println("------------------------------");    
                            System.out.println("------------------------------");
                            System.out.println("----JUGADOR NUMERO "+i);
                            System.out.println("presione enter para lanzar (1) dado");
                            String entra = Datos.nextLine();
                            System.out.println(entra);
                            int dado1 = 1 + aleatorio.nextInt(6);
                            System.out.println("-DADO 1:  "+dado1);
                            
                            vectores[i]=dado1+vectores[i];
                            
                            if (vectores[i]>50 ){
                            vectores[i]=vectores[i]-dado1;
                            System.out.println("¡¡¡ EL NUMERO OBTENIDO NO VALE, LA META ES 20 ¡¡¡¡");
                            }//cierre de pasarse 
                            if (vectores[i]==50){
                            ganador=50;
                            gana=i;
                            i=numj+1;
                            }//NOMBRE DEL GANADOR
                         }
                         
                        
                         
                         
                         
                    }//cierre for
                        
            }//cierre de while 
            if (ganador==50){
                System.out.println("\n\n\n");
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡   FIN DEL JUEGO  ¡¡¡¡");
                System.out.println("GANADOR JUGADOR => "+gana);
            }//ciiere de GANADOR     
            
            
        break; //cierre case 3
        
        
        
        
        
        
        
        default:
            System.out.println("¡¡¡opcion incorrecta¡¡¡¡");
            
            break;
    }//cierre de opc 
    }//ciiere de void 
    
}//cierre de class

