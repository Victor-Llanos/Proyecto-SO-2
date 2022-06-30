/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso2;

import java.util.Random;

/**
 *
 * @author mvlop
 */
public class AI {
    
    public void iaProbability(Phones phone){
        Admin admin = new Admin();
        
        int limit = 100;
        
        Random probability = new Random();
        int probability2 = probability.nextInt(limit);
        
        if( probability2 <= 40){
            System.out.println("salió al mercado");
        }
        
        else if( probability2 > 40 && probability2 <= 67 ){
            System.out.println("empató");
        }
        
        else{
            System.out.println("requiere refuerzos");
        }
        
    }
    
}
