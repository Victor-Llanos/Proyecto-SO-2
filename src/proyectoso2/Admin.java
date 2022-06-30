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
 
    public void addPhone () {
        //se establecen los limites de nivel
        
        int limit = 4000;
        int limit2 = 4000;

        
        //genera el número random de copas para las tres plantas
      
        
        Random rand = new Random(); 
     
        int levelthropsP1 = rand.nextInt(limit);     
        int levelthropsP2 = rand.nextInt(limit);  
        int levelthropsP3 = rand.nextInt(limit);  
        int probs = rand.nextInt(limit2);  
        
        if (ProyectoSO2.released == 0) {
              
            

                // SE AGREGA A PLANTA 1
            
                Phones phone1 = returnPhoneAdded(levelthropsP1, 1);
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
                            
                // SE AGREGA A PLANTA 2
            
                Phones phone2 = returnPhoneAdded(levelthropsP2, 2);
                queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);

            
                // SE AGREGA A PLANTA 3
            
                Phones phone3 = returnPhoneAdded(levelthropsP3, 3);
                queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);

        
        } else {
            
            if (probs <= 70) {
                
                // SE AGREGA A PLANTA 1
            
                Phones phone1 = returnPhoneAdded(levelthropsP1, 1);
                queueLevel(phone1, ProyectoSO2.level1QueueP1, ProyectoSO2.level2QueueP1, ProyectoSO2.level3QueueP1);
                            
                // SE AGREGA A PLANTA 2
            
                Phones phone2 = returnPhoneAdded(levelthropsP2, 2);
                queueLevel(phone2, ProyectoSO2.level1QueueP2, ProyectoSO2.level2QueueP2, ProyectoSO2.level3QueueP2);

            
                // SE AGREGA A PLANTA 3
            
                Phones phone3 = returnPhoneAdded(levelthropsP3, 3);
                queueLevel(phone3, ProyectoSO2.level1QueueP3, ProyectoSO2.level2QueueP3, ProyectoSO2.level3QueueP3);

            }
            
            
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
                    
                    
                    break;
                }
            case 2:
                {
                    Phones queue1Phone = dequeuePhone(ProyectoSO2.level1QueueP2);
                    Phones queue2Phone = dequeuePhone(ProyectoSO2.level2QueueP2);
                    Phones queue3Phone = dequeuePhone(ProyectoSO2.level3QueueP2);
                    if (queue1Phone == null && queue2Phone == null && queue3Phone == null) {
                        System.out.println("NO HAY TELÉFONOS A SELECCIONAR");
                    } else {
                        
                        //Aquí se puede hacer otro condicional para que dependiendo del teléfono que salga en null este no se muestre
                        //y solo se muestren los que no retornaron null
                        System.out.println("Se desencolaron los teléfonos: " + queue1Phone.id + queue2Phone.id + queue1Phone.id);
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
                    
                    
                    break;
                }
            case 3:
                {
                        Phones queue1Phone = dequeuePhone(ProyectoSO2.level1QueueP3);
                        Phones queue2Phone = dequeuePhone(ProyectoSO2.level2QueueP3);
                        Phones queue3Phone = dequeuePhone(ProyectoSO2.level3QueueP3);
                        if (queue1Phone == null && queue2Phone == null && queue3Phone == null) {
                                System.out.println("NO HAY TELÉFONOS A SELECCIONAR");
                                } else {
                        
                        //Aquí se puede hacer otro condicional para que dependiendo del teléfono que salga en null este no se muestre
                        //y solo se muestren los que no retornaron null
                        System.out.println("Se desencolaron los teléfonos: " + queue1Phone.id + queue2Phone.id + queue1Phone.id);
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
                        break;
                }
            default:
                {
                        break;
                        }
        }
        
        Node first = ProyectoSO2.reforcementQueue.getFirst();
        for (int i = 0; i < ProyectoSO2.reforcementQueue.getSize(); i++) {
            Phones phone = (Phones) first.getData();
            phone.sumCounter();
            first = first.getNext();
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
            reEnqueue(phone);
            //Se encola según el nivel
            
        }
    }
    
    
    
    
    
   
    
    

    
}
