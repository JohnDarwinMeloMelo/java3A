/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Datos;
        Datos = new Scanner(System.in);
        int mayor=0,a=1,n1=0,n2=0,n3=0,n4=0;
        System.out.println("DIGITE (1) NUMERO:");
        n1=Datos.nextInt();
        System.out.println("DIGITE (2) NUMERO:");
        n2=Datos.nextInt();
        System.out.println("DIGITE (3) NUMERO:");
        n3=Datos.nextInt();
        System.out.println("DIGITE (4) NUMERO:");
        n4=Datos.nextInt();
        
        if (n1>n2){
            mayor=n1;
            }
        if (n1<n2){
            mayor=n2;
            }
        
        if (n3>mayor){
            mayor=n3;
            }
        
        if (n4>mayor){
            mayor=n4;
            }
        System.out.println("NUMERO:(1)"+n1);
        System.out.println("NUMERO:(2)"+n2);
        System.out.println("NUMERO:(3)"+n3);
        System.out.println("NUMERO:(4)"+n4);
        System.out.println("----------------------------");
        System.out.println("**EL NUMERO MAYOR ES: "+mayor);
    }
    
}
