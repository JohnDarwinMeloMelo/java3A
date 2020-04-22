/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge_vector_1;

import java.util.Scanner;

/**
 *
 * @author MELO
 */
public class Challenge_vector_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[]=new int [100];
        int i=0,res=0;
        Scanner reader = new Scanner(System.in);
        while (i<2){
        System.out.println("DIGITE UN NUMERO:");
        numeros[i] = reader.nextInt();
        i++;
        
        }
        
        
        
        
        if (i>=2){
        for (i=i;i<=100;i++)
        {
            
            
            res=numeros[i-1]+numeros[i-2];
            System.out.println("DIGITE UN NUMERO");
            numeros[i] = reader.nextInt();
            if (res==numeros[i] ){
                while (res==numeros[i]){
                    System.out.println("------------ERROR---------");
                    System.out.println("DIGITE OTRA VEZ EL NUMERO:");
                    numeros[i] = reader.nextInt();
                }
            }
           
            
           
        }
        }
    }
    
}
