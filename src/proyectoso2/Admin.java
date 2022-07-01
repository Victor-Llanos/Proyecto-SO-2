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
public class Admin {
    
    

    private Phones returnPhoneAdded(int trophies, int plantN) {
        
              if (trophies <= 1999) {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 3, trophies, plantN);
                return phone;

            } else if (trophies >= 2000 && trophies <= 3000) {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 2, trophies, plantN);
                return phone;

            } else {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 1, trophies, plantN);            
                return phone;

            
            }
              
              
    }    
 
    public void addPhone () {
        //se establecen los limites de nivel
        
        int probs = 100;
        Phones phone = new Phones();
        Phones phone2 = new Phones();
        Phones phone3 = new Phones();
        //Se suman las copas determinadas por el porcentaje de exitos por pieza del telefono, de cada de telefono
      
        
        Random rand = new Random(); 
        
        int screenProbs = rand.nextInt(probs);
        int pinProbs = rand.nextInt(probs);
        int camProbs = rand.nextInt(probs);
        int buttonProbs = rand.nextInt(probs);
        
        int total = 0;
        
        int screenProbs2 = rand.nextInt(probs);
        int pinProbs2 = rand.nextInt(probs);
        int camProbs2 = rand.nextInt(probs);
        int buttonProbs2 = rand.nextInt(probs);
        
        int total2 = 0;
        
        int screenProbs3 = rand.nextInt(probs);
        int pinProbs3 = rand.nextInt(probs);
        int camProbs3 = rand.nextInt(probs);
        int buttonProbs3 = rand.nextInt(probs);
        
        int total3 = 0;
       
        //Telefono Xperia 10 IV
        
        //Screen
        for (int i = 0; i < 2; i++) {
            if (screenProbs <= 75){
                total += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Pin
        for (int i = 0; i < 2; i++) {
            if (pinProbs <= 84){
                total += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Cam
        for (int i = 0; i < 4; i++) {
            if (camProbs <= 80){
                total += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Button
        for (int i = 0; i < 5; i++) {
            if (buttonProbs <= 85){
                total += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Telefono Xperia 10 III
        
        //Screen
        for (int i = 0; i < 2; i++) {
            if (screenProbs <= 75){
                total2 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Pin
        for (int i = 0; i < 2; i++) {
            if (pinProbs <= 84){
                total2 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Cam
        for (int i = 0; i < 3; i++) {
            if (camProbs <= 80){
                total2 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Button
        for (int i = 0; i < 3; i++) {
            if (buttonProbs <= 85){
                total2 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Telefono Xperia Pro-I
        
        //Screen
        for (int i = 0; i < 3; i++) {
            if (screenProbs <= 75){
                total3 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Pin
        for (int i = 0; i < 2; i++) {
            if (pinProbs <= 84){
                total3 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Cam
        for (int i = 0; i < 5; i++) {
            if (camProbs <= 80){
                total3 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        //Button
        for (int i = 0; i < 4; i++) {
            if (buttonProbs <= 85){
                total3 += 400;
            }else{
                phone.setGood(false);
            }
        }
        
        if (ProyectoSO2.released == 0) {
              
            
                // SE AGREGA A PLANTA 1
            
                phone = returnPhoneAdded(total, 1);
                ProyectoSO2.level1QueueP1.encolar(phone);
                            
                // SE AGREGA A PLANTA 2
            
                phone2 = returnPhoneAdded(total2, 2);
                ProyectoSO2.level1QueueP2.encolar(phone2);
            
                // SE AGREGA A PLANTA 3
            
                phone3 = returnPhoneAdded(total3, 3);
                ProyectoSO2.level1QueueP3.encolar(phone3);

        
        } else {
            //ME FALTA ESTO AAAAAAAAAAAAAAAAAAAAAAAAAAAA
        } 
        
    }
    
    //DESENCOLA EL TELÉFONO DE LA COLA SELECCIONADA
    
    private Phones dequeuePhone(Cola selectedQueue) {
        if (selectedQueue.getSize()>0) {
            Phones selected = (Phones) selectedQueue.desencolar();
            selected.resetCounter();
            return selected;
        } else {
            //NO HAY TELEFONOS EN LA COLA
            return null;
        }
    }
    
   
    public void selectPhone(int plantN) {
        switch (plantN) {
            case 1:
                {
                    Phones queue1Phone = dequeuePhone(ProyectoSO2.level1QueueP1);
                    Phones queue2Phone = dequeuePhone(ProyectoSO2.level2QueueP1);
                    Phones queue3Phone = dequeuePhone(ProyectoSO2.level3QueueP1);
                    if (queue1Phone == null && queue2Phone == null && queue3Phone == null) {
                        System.out.println("NO HAY TELÉFONOS A SELECCIONAR");
                    } else {
                        
                        //Aquí se puede hacer otro condicional para que dependiendo del teléfono que salga en null este no se muestre
                        //y solo se muestren los que no retornaron null
                        System.out.println("Se desencolaron los teléfonos: " + queue1Phone.id + queue2Phone.id + queue1Phone.id);
                    }
                    break;
                }
            case 2:
                {
                    Phones queue1Phone = dequeuePhone(ProyectoSO2.level1QueueP2);
                    Phones queue2Phone = dequeuePhone(ProyectoSO2.level2QueueP2);
                    Phones queue3Phone = dequeuePhone(ProyectoSO2.level3QueueP2);
                    if (queue1Phone == null && queue2Phone == null && queue3Phone == null) {
                        System.out.println("NO HAY TELÉFONOS A SELECCIONAR");
                    }
                    break;
                }
            case 3:
                {
                        Phones queue1Phone = dequeuePhone(ProyectoSO2.level1QueueP3);
                        Phones queue2Phone = dequeuePhone(ProyectoSO2.level2QueueP3);
                        Phones queue3Phone = dequeuePhone(ProyectoSO2.level3QueueP3);
                        if (queue1Phone == null && queue2Phone == null && queue3Phone == null) {
                                System.out.println("NO HAY TELÉFONOS A SELECCIONAR");
                                }
                        break;
                }
            default:
                {
                        break;
                        }
        }
    }
    
    
    
    //DEPENDIENDO DEL NIVEL DE PRIORIDAD SE ENCOLA SEGUN ESTE
    private void queueLevel(Phones phone, Cola level1, Cola level2, Cola level3) {
        switch (phone.level) { 
            case 1:
            {
                level1.encolar(phone);
            }
            case 2:
            {
                level2.encolar(phone);
            }
            case 3:
            {
                level3.encolar(phone);
                
            }
            default: {
                    break;
                    }
        }
    }     
    
    
    
// Usado para reencolar en caso de que se tenga que encolar de nuevo un teléfono en revisión    
    public void reEnqueue(Phones phone) {
        switch (phone.plant) { 
            case 1:
            {
                queueLevel(phone, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
            }
            case 2:
            {
                queueLevel(phone, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);
                
            }
            case 3:
            {
                queueLevel(phone, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);
                
            }
            default: {
                    break;
                    }
        }
    }
    
    //función para encolar 
    public void enqueueReforcement(Phones phone) {
        ProyectoSO2.reforcementQueue.encolar(phone);
    }
    
    //funcion para que en caso de un 40% de probabilidad se desencole el primer telefono
    
    public void dequeueReforcement() {
        Random rand = new Random(); 
    
        int probability = rand.nextInt(100);     

        if (ProyectoSO2.reforcementQueue.getSize() > 0 && probability <= 40){
            Phones phone = (Phones) ProyectoSO2.reforcementQueue.desencolar();
            
            
        }
    }
    
    
    
    
    
   
    
    

    
}
