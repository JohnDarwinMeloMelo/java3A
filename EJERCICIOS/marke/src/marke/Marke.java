/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marke;

import java.util.ArrayList;

/**
 *
 * @author MELO
 */
public class Marke {

    /**
     * @param args the command line arguments
     * 
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("cherolet");//0
        cars.add("mazda");//1
        cars.add("nissan");//2
        cars.add("suzuki");//3
        
        System.out.println(cars);
        
        System.out.println(cars.get(2));
        
        String viejo=cars.get(2);
        cars.set(2, "nisssan march");
        System.out.println(viejo+" cambiado por: "+cars.get(2));
        System.out.println("tamaño: "+cars.size());
    }
    
}
