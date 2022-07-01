/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoso2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mvlop
 */
public class Admin {
    
    

    private Phones returnPhoneAdded(int trophies, int plantN, boolean isGood) {
        
              if (trophies <= 1999) {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 3, trophies, plantN, isGood);
                return phone;

            } else if (trophies >= 2000 && trophies <= 3000) {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 2, trophies, plantN, isGood);
                return phone;

            } else {
                int id = ProyectoSO2.id ++;
                Phones phone = new Phones(id, 1, trophies, plantN, isGood);            
                return phone;

            
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
    
    
    private int detQuality(int a, int probs, int prob1) {
       
        for (int i = 0; i < a; i++) {
            if (ThreadLocalRandom.current().nextInt(0, probs) <= prob1){
                return 400;
            }else{
                return 0;
            }
        }
        return 0;
    }
    
    
    public void addPhone () {
        //se establecen los limites de nivel
        
        int probs = 100;

        //Se suman las copas determinadas por el porcentaje de exitos por pieza del telefono, de cada de telefono
      
        
        Random rand = new Random(); 
        int screenProbs = ThreadLocalRandom.current().nextInt(0, probs);
        int pinProbs = ThreadLocalRandom.current().nextInt(0, probs);
        int camProbs = ThreadLocalRandom.current().nextInt(0, probs);
        int buttonProbs = ThreadLocalRandom.current().nextInt(0, probs);
        
        int total = 0;
        
        int screenProbs2 = ThreadLocalRandom.current().nextInt(0, probs);
        int pinProbs2 = ThreadLocalRandom.current().nextInt(0, probs);
        int camProbs2 = ThreadLocalRandom.current().nextInt(0, probs);
        int buttonProbs2 = ThreadLocalRandom.current().nextInt(0, probs);
        
        int total2 = 0;
        
        int screenProbs3 = ThreadLocalRandom.current().nextInt(0, probs);
        int pinProbs3 = ThreadLocalRandom.current().nextInt(0, probs);
        int camProbs3 = ThreadLocalRandom.current().nextInt(0, probs);
        int buttonProbs3 = ThreadLocalRandom.current().nextInt(0, probs);
        
        int total3 = 0;
       

        
        if (ProyectoSO2.released == 0) {
              
        //Telefono Xperia 10 IV
        
        //Screen

        
        int screenB = detQuality(2, screenProbs, 75);
        total += screenB;
        
        //Pin

        int pinB = detQuality(2, pinProbs, 84);
        total += pinB;
       
        //Cam

        
        int camB = detQuality(4, camProbs, 80);
        total += camB;        
        //Button

        
        int buttonB = detQuality(4, buttonProbs, 85);        
        total += buttonB;        

        //Telefono Xperia 10 IV                     
        
        
        if (screenB == 0 || pinB == 0 || camB == 0 || buttonB == 0) {
                Phones phone1 = returnPhoneAdded(total, 1, false);
                phone1.setName("Xperia 10 IV");
                phone1.setInfo("3 cámaras, 1 pantalla, 4 botones. Precio: 900$");
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
            
        } else {
                           Phones phone1 = returnPhoneAdded(total, 1, true);
                phone1.setName("Xperia 10 IV");
                phone1.setInfo("3 cámaras, 1 pantalla, 4 botones. Precio: 900$");
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1); 
        }
        
        //Screen

        int screen2B = detQuality(1, screenProbs2, 75);
        total2 += screen2B; 
        
        //Pin

        
        int pin2B = detQuality(1, pinProbs2, 84);
        total2 += pin2B;         
        
        //Cam
        int cam2B = detQuality(2, camProbs2, 80);
        total2 += cam2B;     
        
        //Button
        int button2B = detQuality(2, buttonProbs2, 80);
        total2 += button2B; 
        
        //Telefono Xperia 10 III
            if (screen2B == 0 || pin2B == 0 || cam2B == 0 || button2B == 0) {
                   Phones phone2 = returnPhoneAdded(total2, 2, false);
                    phone2.setName("Xperia 10 III");
                    phone2.setInfo("2 cámaras, 1 pantalla, 2 botones. Precio: 600$");  
                   queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);

           } else {
                   Phones phone2 = returnPhoneAdded(total2, 2, true);
                    phone2.setName("Xperia 10 III");
                    phone2.setInfo("2 cámaras, 1 pantalla, 2 botones. Precio: 600$");  
                   queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2); 
           }       
        
        
        //Screen
        int screen3B = detQuality(2, screenProbs3, 75);
        total3 += screen3B; 
        
        //Pin
        int pin3B = detQuality(1, pinProbs3, 84);
        total3 += pin3B;  
        
        //Cam
        int cam3B = detQuality(4, camProbs3, 80);
        total3 += cam3B; 
        
        //Button
        int button3B = detQuality(4, buttonProbs3, 85);
        total3 += button3B;
            if (screen2B == 0 || pin2B == 0 || cam2B == 0 || button2B == 0) {
                   Phones phone3 = returnPhoneAdded(total3, 3, false);
                    phone3.setName("Xperia Pro-I");
                    phone3.setInfo("4 cámaras, 2 pantalla (plegable), 3 botones. Precio: 1050$");  
                   queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);

           } else {
                   Phones phone3 = returnPhoneAdded(total3, 3, true);
                    phone3.setName("Xperia Pro-I");
                    phone3.setInfo("4 cámaras, 2 pantalla (plegable), 3 botones. Precio: 1050$");  
                   queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3); 
           }  
        
        } else {
            if (probs <= 70) {
                
              
        //Telefono Xperia 10 IV
        
        //Screen

        
        int screenB = detQuality(1, screenProbs, 75);
        total += screenB;
        
        //Pin

        int pinB = detQuality(1, pinProbs, 84);
        total += pinB;
       
        //Cam

        
        int camB = detQuality(3, camProbs, 80);
        total += camB;        
        //Button

        
        int buttonB = detQuality(3, buttonProbs, 85);        
        total += buttonB;        

        //Telefono Xperia 10 IV                     
        
        
        if (screenB == 0 || pinB == 0 || camB == 0 || buttonB == 0) {
                Phones phone1 = returnPhoneAdded(total, 1, false);
                phone1.setName("Xperia 10 IV");
                phone1.setInfo("3 cámaras, 1 pantalla, 4 botones. Precio: 900$");
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
            
        } else {
                           Phones phone1 = returnPhoneAdded(total, 1, true);
                phone1.setName("Xperia 10 IV");
                phone1.setInfo("3 cámaras, 1 pantalla, 4 botones. Precio: 900$");
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1); 
        }
        
        //Screen

        int screen2B = detQuality(1, screenProbs2, 75);
        total2 += screen2B; 
        
        //Pin

        
        int pin2B = detQuality(1, pinProbs2, 84);
        total2 += pin2B;         
        
        //Cam
        int cam2B = detQuality(2, pinProbs2, 80);
        total2 += cam2B;     
        
        //Button
        int button2B = detQuality(2, pinProbs2, 85);
        total2 += button2B; 
        
        //Telefono Xperia 10 III
            if (screen2B == 0 || pin2B == 0 || cam2B == 0 || button2B == 0) {
                   Phones phone2 = returnPhoneAdded(total2, 2, false);
                    phone2.setName("Xperia 10 III");
                    phone2.setInfo("2 cámaras, 1 pantalla, 2 botones. Precio: 600$");  
                   queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);

           } else {
                   Phones phone2 = returnPhoneAdded(total2, 2, true);
                    phone2.setName("Xperia 10 III");
                    phone2.setInfo("2 cámaras, 1 pantalla, 2 botones. Precio: 600$");  
                   queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2); 
           }       
        
        
        //Screen
        int screen3B = detQuality(2, screenProbs2, 75);
        total3 += screen3B; 
        
        //Pin
        int pin3B = detQuality(1, pinProbs2, 84);
        total3 += pin3B;  
        
        //Cam
        int cam3B = detQuality(4, pinProbs2, 80);
        total3 += cam3B; 
        
        //Button
        int button3B = detQuality(3, pinProbs2, 85);
        total3 += button3B;
            if (screen2B == 0 || pin2B == 0 || cam2B == 0 || button2B == 0) {
                   Phones phone3 = returnPhoneAdded(total3, 3, false);
                    phone3.setName("Xperia Pro-I");
                    phone3.setInfo("4 cámaras, 2 pantalla (plegable), 3 botones. Precio: 1050$");  
                   queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);

           } else {
                   Phones phone3 = returnPhoneAdded(total3, 3, true);
                    phone3.setName("Xperia Pro-I");
                    phone3.setInfo("4 cámaras, 2 pantalla (plegable), 3 botones. Precio: 1050$");  
                   queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3); 
           }

            }
        } 
        
    }
    
    

  
    
    

    //DESENCOLA EL TELÉFONO DE LA COLA SELECCIONADA
    
    private Phones dequeuePhone(Cola selectedQueue, Cola selectedQueue2, Cola selectedQueue3) {
        if (selectedQueue.getSize()>0) {
            Phones selected = (Phones) selectedQueue.desencolar();
            selected.resetCounter();
            return selected;
        } else if (selectedQueue2.getSize()>0) {
            Phones selected = (Phones) selectedQueue2.desencolar();
            selected.resetCounter();
            return selected;
        } else if(selectedQueue3.getSize()>0) {
            Phones selected = (Phones) selectedQueue3.desencolar();
            selected.resetCounter();
            return selected;
        } else {
            System.out.println("NO HAY TELÉFONOS EN COLA");
            return null;
            
        }
    }
    
    
   
    public Phones selectPhone(int plantN) {
        Phones phoneSelected = null;
        if (plantN == 1) {
                Phones dequeuePhone1 = dequeuePhone(ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
                    if (dequeuePhone1 == null) {
                        System.out.println("NO HAY TELÉFONOS");
                    } else {
                        phoneSelected = dequeuePhone1;
                    }
            
                    
        //Cuando al Teléfono le toca el turno de ser revisado, este contador se pasa a cero. Por otra parte, cuando el
        //contador llega a 8, el teléfono es subido al siguiente nivel de prioridad y el contador se

        //actualiza a cero nuevamente (es decir, si el teléfono es de nivel 3, pasaría a ser de nivel 2),
        //este funcionamiento solo aplica para teléfonos de nivel 2 y 3.         
        
                    Cola auxQueueLevel2 = new Cola();

                    while(!ProyectoSO2.level2QueueP1.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level2QueueP1.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(1);
                            ProyectoSO2.level1QueueP1.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel2.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level2QueueP1 = auxQueueLevel2;
 
                    Cola auxQueueLevel3 = new Cola();
                    
                    
                    while(!ProyectoSO2.level3QueueP1.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level3QueueP1.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(2);
                            ProyectoSO2.level2QueueP1.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel3.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level3QueueP1 = auxQueueLevel3;
                    Node first = ProyectoSO2.reforcementQueue1.getFirst();


                    for (int i = 0; i < ProyectoSO2.reforcementQueue1.getSize(); i++) {
                        Phones phone = (Phones) first.getData();
                        phone.sumCounter();
                        first = first.getNext(); }                    
                    
                    
                   
                } else if (plantN == 2){
        
        
                Phones dequeuePhone2 = dequeuePhone(ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);
                    if (dequeuePhone2 == null) {
                        System.out.println("NO HAY TELÉFONOS");
                    } else {
                        phoneSelected = dequeuePhone2;
                    }
                    
                    
                    Cola auxQueueLevel2 = new Cola();

                    while(!ProyectoSO2.level2QueueP2.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level2QueueP2.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(1);
                            ProyectoSO2.level1QueueP2.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel2.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level2QueueP2 = auxQueueLevel2;
 
                    Cola auxQueueLevel3 = new Cola();
                    
                    
                    while(!ProyectoSO2.level3QueueP2.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level3QueueP2.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(2);
                            ProyectoSO2.level2QueueP2.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel3.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level3QueueP2 = auxQueueLevel3;   
                    
                Node first = ProyectoSO2.reforcementQueue2.getFirst();


                for (int i = 0; i < ProyectoSO2.reforcementQueue2.getSize(); i++) {
                    Phones phone = (Phones) first.getData();
                    phone.sumCounter();
                    first = first.getNext(); }                    
                    
                    

                }
                else {
                
                Phones dequeuePhone3 = dequeuePhone(ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);
                    if (dequeuePhone3 == null) {
                        System.out.println("NO HAY TELÉFONOS");
                    } else {
                        phoneSelected = dequeuePhone3;
                    }
                        
                    Cola auxQueueLevel2 = new Cola();

                    while(!ProyectoSO2.level2QueueP3.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level2QueueP3.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(1);
                            ProyectoSO2.level1QueueP3.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel2.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level2QueueP3 = auxQueueLevel2;
 
                    Cola auxQueueLevel3 = new Cola();
                    
                    
                    while(!ProyectoSO2.level3QueueP3.isEmpty()) {
                        Phones phone;
                        phone = (Phones) ProyectoSO2.level3QueueP3.desencolar();
                        if (phone.counter >= 8) {
                            phone.resetCounter();
                            phone.setLevel(2);
                            ProyectoSO2.level2QueueP3.encolar(phone);
                        } else {
                            phone.sumCounter();
                            auxQueueLevel3.encolar(phone);
                        }
                    }
                    
                    ProyectoSO2.level3QueueP3 = auxQueueLevel3;    
                    
                    
                  Node first = ProyectoSO2.reforcementQueue3.getFirst();
        
        
                for (int i = 0; i < ProyectoSO2.reforcementQueue3.getSize(); i++) {
                    Phones phone = (Phones) first.getData();
                    phone.sumCounter();
                    first = first.getNext(); }                    
                        }
        
        

        
        return phoneSelected;
        
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
        switch (phone.plant) {
            case 1: {
                ProyectoSO2.reforcementQueue1.encolar(phone);
            } case 2: {
                ProyectoSO2.reforcementQueue2.encolar(phone);
                
            } case 3: {
                ProyectoSO2.reforcementQueue3.encolar(phone);
                
            }
            
        }
    }
    
    //funcion para que en caso de un 40% de probabilidad se desencole el primer telefono
    
    public void dequeueReforcement() { 
    
        int probability1 = ThreadLocalRandom.current().nextInt(0, 100);     
        int probability2 = ThreadLocalRandom.current().nextInt(0, 100);       
        int probability3 = ThreadLocalRandom.current().nextInt(0, 100);       

        
        
        if (ProyectoSO2.reforcementQueue1.getSize() > 0 && probability1 <= 40){
            Phones phone = (Phones) ProyectoSO2.reforcementQueue1.desencolar();
            reEnqueue(phone);
            //Se encola según el nivel           
        }
        if (ProyectoSO2.reforcementQueue2.getSize() > 0 && probability2 <= 40){
            Phones phone = (Phones) ProyectoSO2.reforcementQueue2.desencolar();
            reEnqueue(phone);
            //Se encola según el nivel           
        }
        if (ProyectoSO2.reforcementQueue3.getSize() > 0 && probability3 <= 40){
            Phones phone = (Phones) ProyectoSO2.reforcementQueue3.desencolar();
            reEnqueue(phone);
            //Se encola según el nivel           
        }
    }
    
    
    
    
    
   
    
    

    
}
