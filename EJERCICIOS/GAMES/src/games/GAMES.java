/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MELO
 */
public class GAMES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random N = new Random();
        Scanner teclado =new Scanner(System.in);
        int x=0,i=0,conP=0,acuP=0,acuI=0,conI=0,limite=0;
        System.out.println("digite el limite:");
        limite=teclado.nextInt();
        
        
        for (i=1;i<=limite;i++){
        x=(int)(N.nextDouble()*10+1);
        System.out.println(x);
        if (x%2==0){
            conP=conP+1;
            acuP=acuP+x;
            System.out.print(x+"es par");
        }else{
            conI=conI+1;
            acuI=acuI+x;
            System.out.println(x+"es impar");
        }
    }
        System.out.println("total de pares: "+conP);
        System.out.println("suma de pares: "+acuP);
        System.out.println("total de impares: "+conI);
        System.out.println("suma de impares: "+acuI);
        
    
    
    }
    
    
    
    
    
    
}
